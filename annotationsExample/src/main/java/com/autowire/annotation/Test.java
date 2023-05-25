package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Truck truck=context.getBean("truck",Truck.class);
		System.out.println(truck);

	}

}
/*
private Vehicle vehicle;
<bean id="vehicle" class="vehicle">
<bean id="vehicle1" class="vehicle">*/
