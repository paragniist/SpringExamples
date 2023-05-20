package com.hdfcbanking.config;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import com.hdfcbanking.exception.NotEligibleException;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.hdfcbanking.controller" })
public class HdfcBankingWebConfig implements WebMvcConfigurer {

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("errors");
		return messageSource;
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp/", ".jsp");
	}

	@Bean
	public HandlerExceptionResolver genericExceptionResolver() {
		SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
		Properties mappings = new Properties();
		mappings.put(NotEligibleException.class.getName(), "global-error");
		exceptionResolver.setExceptionMappings(mappings);

		exceptionResolver.setDefaultErrorView("global-error");
		exceptionResolver.setExceptionAttribute("ex");

		return exceptionResolver;
	}

}
