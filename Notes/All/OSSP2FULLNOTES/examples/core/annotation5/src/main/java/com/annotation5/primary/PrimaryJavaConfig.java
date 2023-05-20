package com.annotation5.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.annotation5.primary")
public class PrimaryJavaConfig {
	@Bean
	public MonoBell monoBell() {
		return new MonoBell();
	}

	@Bean
	@Primary
	public DigitalBell digitalBell() {
		return new DigitalBell();
	}
}
