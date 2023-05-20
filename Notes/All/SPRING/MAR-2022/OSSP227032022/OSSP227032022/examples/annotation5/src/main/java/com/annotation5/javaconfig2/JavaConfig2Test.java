package com.annotation5.javaconfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfig2Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig2.class);
		Powerstation powerstation = context.getBean("powerstation", Powerstation.class);
		powerstation.on();
	}
}
