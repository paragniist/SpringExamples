package com.annotation5.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();
		((ConfigurableApplicationContext) context).getEnvironment().setActiveProfiles("test");
		((AnnotationConfigApplicationContext) context).register(RootConfig.class);
		((ConfigurableApplicationContext) context).refresh();

		Tournament tournament = context.getBean("tournament", Tournament.class);
		System.out.println(tournament);

	}
}
