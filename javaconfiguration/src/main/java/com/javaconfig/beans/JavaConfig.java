package com.javaconfig.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Parag newParag() {
		Parag parag=new Parag();
		System.out.println(parag);
		return parag;
	}
}
