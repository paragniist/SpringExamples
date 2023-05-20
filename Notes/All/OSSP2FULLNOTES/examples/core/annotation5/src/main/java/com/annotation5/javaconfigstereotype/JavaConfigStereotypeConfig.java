package com.annotation5.javaconfigstereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/annotation5/javaconfigstereotype/common.properties")
@ComponentScan(basePackages = { "com.annotation5.javaconfigstereotype" })
public class JavaConfigStereotypeConfig {
	@Autowired
	private Environment env;

	@Bean
	public GasPump gasPump() {
		GasPump gasPump = new GasPump();
		gasPump.setPumpNo(Integer.parseInt(env.getProperty("gasPump.pumpNo")));
		gasPump.setFuelType(env.getProperty("gasPump.fuelType"));

		return gasPump;
	}
}
