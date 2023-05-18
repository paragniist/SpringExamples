package com.profiles.annotaion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CommonConfig.class);
		//context.register(CommonConfig.class);
		//context.getEnvironment().setActiveProfiles("test");
		//context.refresh();
		
		Motor motor=context.getBean("motor",Motor.class);
		System.out.println(motor);
	}
}
