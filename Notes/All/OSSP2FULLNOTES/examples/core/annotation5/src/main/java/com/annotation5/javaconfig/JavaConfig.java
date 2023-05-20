package com.annotation5.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

	@Bean(name = { "nexus5", "nexus5.1" }, autowire = Autowire.BY_NAME)
	// @Scope("prototype")
	// @Lazy
	public Tab galaxy5Tab() {
		Tab tab = new Tab();
		return tab;
	}

	@Bean
	public Microphone microphone() {
		Microphone microphone = new Microphone();
		return microphone;
	}
}
