package com.lmi.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.lmi.beans.Car;

public class LMITest {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/lmi/common/application-context.xml"));
		
		Car car1 = beanFactory.getBean("car", Car.class);
		car1.drive();
		
		System.out.println("Car : " + car1.getClass().getName());
		
		Car car2 = beanFactory.getBean("car", Car.class);
		car2.drive();
	}
}














