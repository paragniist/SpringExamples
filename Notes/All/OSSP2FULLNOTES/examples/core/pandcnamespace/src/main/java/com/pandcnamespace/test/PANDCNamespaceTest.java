package com.pandcnamespace.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pandcnamespace.beans.Car;

public class PANDCNamespaceTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/pandcnamespace/common/application-context.xml"));
		Car car = beanFactory.getBean("car", Car.class);
		System.out.println(car);

	}
}
