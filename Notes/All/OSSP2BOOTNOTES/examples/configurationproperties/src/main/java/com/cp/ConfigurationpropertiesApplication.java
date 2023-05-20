package com.cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.cp.beans.Policy;

@SpringBootApplication
//@EnableConfigurationProperties
public class ConfigurationpropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConfigurationpropertiesApplication.class, args);
		Policy policy = context.getBean(Policy.class);
		System.out.println(policy);
	}

}
