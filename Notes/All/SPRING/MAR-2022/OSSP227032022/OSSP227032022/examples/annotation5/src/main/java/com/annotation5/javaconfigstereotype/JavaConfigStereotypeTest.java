package com.annotation5.javaconfigstereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigStereotypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigStereotypeConfig.class);
		GasStation gasStation = context.getBean("gasStation", GasStation.class);
		System.out.println(gasStation);
	}
}
