package com.annotation5.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryJavaConfig.class);
		Alarm alarm = context.getBean("alarm", Alarm.class);
		alarm.remind();
	}
}
