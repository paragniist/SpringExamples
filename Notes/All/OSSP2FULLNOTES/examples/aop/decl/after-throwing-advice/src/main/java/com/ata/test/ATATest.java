package com.ata.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ata.beans.Thrower;

public class ATATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ata/common/application-context.xml");
		Thrower thrower = context.getBean("thrower", Thrower.class);
		int i = thrower.willThrow(-1);
		System.out.println("i : " + i);
	}
}
