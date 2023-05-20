package com.annotation5.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StreotypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/annotation5/stereotype/stereotype-beans.xml");
		/*
		 * Bike bike1 = context.getBean("sportsBike", Bike.class); // bike.ride(); Bike
		 * bike2 = context.getBean("sportsBike", Bike.class);
		 * System.out.println("bike1 == bike2 ? : " + (bike1 == bike2));
		 */
	}
}
