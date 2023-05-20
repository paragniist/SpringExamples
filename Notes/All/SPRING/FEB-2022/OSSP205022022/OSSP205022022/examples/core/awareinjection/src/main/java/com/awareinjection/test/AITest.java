package com.awareinjection.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.awareinjection.beans.Car;

public class AITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/awareinjection/common/application-context.xml"));
		Car car = beanFactory.getBean("car", Car.class);
		car.drive();
	}
}
