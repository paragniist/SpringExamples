package com.annotation5.javaconfigps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigPSTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigPSConfig.class);
		Library library = context.getBean("library", Library.class);
		System.out.println(library);
	}
}
