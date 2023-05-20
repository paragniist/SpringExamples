package com.annotation5.importannon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		Exchange exchange = context.getBean("exchange", Exchange.class);
		System.out.println(exchange);
	}
}
