package com.cbc;

import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.cbc.beans.Motor;

@SpringBootApplication
public class CBCApplication {
	public static void main(String[] args) {
		// ApplicationContext context = SpringApplication.run(CBCApplication.class,
		// args);
		// Motor motor = context.getBean(Motor.class);
		// System.out.println(motor);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(CBCApplication.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.lazyInitialization(true);

		/*
		 * SpringApplication springApplication = builder.build(); ApplicationContext
		 * context = springApplication.run(args);
		 */
		// Motor motor = context.getBean(Motor.class);
		// System.out.println(motor);
		ApplicationContext context = new SpringApplicationBuilder(CBCApplication.class).bannerMode(Mode.OFF)
				.lazyInitialization(true).build().run(args);
	}
}
