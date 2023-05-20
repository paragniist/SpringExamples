package com.annotation5.xmlstereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlStereotypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/annotation5/xmlstereotype/xmlstereotype-beans.xml");
		Gear gear = context.getBean("gear", Gear.class);
		gear.forward();
	}
}
