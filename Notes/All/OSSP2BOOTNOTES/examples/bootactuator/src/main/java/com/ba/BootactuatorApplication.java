package com.ba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BootactuatorApplication implements WebMvcConfigurer {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(BootactuatorApplication.class, args);
	}
 
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("index");
	}

	
}
