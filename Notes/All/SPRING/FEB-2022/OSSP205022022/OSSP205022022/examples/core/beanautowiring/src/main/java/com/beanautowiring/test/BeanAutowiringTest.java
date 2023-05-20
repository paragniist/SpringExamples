package com.beanautowiring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanautowiring.beans.Salesorder;

public class BeanAutowiringTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/beanautowiring/common/application-context.xml"));
		Salesorder salesorder = beanFactory.getBean("salesorder", Salesorder.class);
		System.out.println(salesorder);
	}
}
