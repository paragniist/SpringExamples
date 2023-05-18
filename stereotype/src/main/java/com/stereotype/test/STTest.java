package com.stereotype.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stereotype.beans.Aeroplane;

public class STTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.stereotype.beans");
		Aeroplane plane=context.getBean("aeroplane",Aeroplane.class);
		plane.fly();

	}

}
