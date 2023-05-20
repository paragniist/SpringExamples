package com.swr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = { "com.sbr.client" })
public class RestConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
