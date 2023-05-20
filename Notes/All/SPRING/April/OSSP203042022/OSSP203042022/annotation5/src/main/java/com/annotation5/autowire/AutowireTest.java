package com.annotation5.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation5/autowire/autowire-beans.xml");
		Radio radio = context.getBean("radio", Radio.class);
		System.out.println(radio);
	}
}
