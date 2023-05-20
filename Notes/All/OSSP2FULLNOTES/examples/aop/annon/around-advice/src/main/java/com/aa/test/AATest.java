package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aa.beans.Calculator;
import com.aa.config.AAJavaConfig;

public class AATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AAJavaConfig.class);
		Calculator calculator = context.getBean("calculator", Calculator.class);
		int sum = calculator.add(10, 20);
		System.out.println("sum : " + sum);

		sum = calculator.add(10, 20);
		System.out.println("sum : " + sum);
	}
}
