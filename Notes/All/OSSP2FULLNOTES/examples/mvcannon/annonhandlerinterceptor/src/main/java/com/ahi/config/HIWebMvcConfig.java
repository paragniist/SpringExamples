package com.ahi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ahi.interceptor.LogHttpHandlerInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.ahi.controller", "com.ahi.interceptor" })
public class HIWebMvcConfig implements WebMvcConfigurer {
	@Autowired
	private LogHttpHandlerInterceptor logHttpHandlerInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(logHttpHandlerInterceptor).addPathPatterns("/our-mission.htm");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp/", ".jsp");
	}

}
