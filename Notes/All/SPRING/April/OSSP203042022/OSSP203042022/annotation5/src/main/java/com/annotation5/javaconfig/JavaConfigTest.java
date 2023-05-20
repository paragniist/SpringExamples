package com.annotation5.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		Tab tab1 = context.getBean("nexus5.1", Tab.class);
		//Tab tab2 = context.getBean("nexus5", Tab.class);
		//System.out.println("tab1 == tab2 ? : " + (tab1 == tab2));
		tab1.on();

	}
}
