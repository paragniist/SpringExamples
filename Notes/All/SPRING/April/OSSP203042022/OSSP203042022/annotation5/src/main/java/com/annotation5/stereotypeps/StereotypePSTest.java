package com.annotation5.stereotypeps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypePSTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation5.stereotypeps");
		Book book = context.getBean("book", Book.class);
		System.out.println(book);
	}
}
