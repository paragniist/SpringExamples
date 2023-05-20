package com.annotation5.importresource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = { "com.annotation5.importresource" })
@ImportResource("classpath:com/annotation5/importresource/thermostat-beans.xml")
public class ImportResourceJavaConfig {

	@Bean
	public HeatingElement heatingElement() {
		return new HeatingElement();
	}
}
