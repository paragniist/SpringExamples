package com.annotation5.resourceinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceInjectTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/annotation5/resourceinject/javaconfig-beans.xml");
		Radio radio = context.getBean("radio", Radio.class);
		radio.on();
	}
}
