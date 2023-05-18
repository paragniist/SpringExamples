package com.stereotypejavaconfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotation.stereotypejvaconfig.Robot;
import annotation.stereotypejvaconfig.SJJavaConfig;

public class STJTest {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(SJJavaConfig.class);
		Robot robot=context.getBean("robot",Robot.class);
		System.out.println(robot);

	}

}






















