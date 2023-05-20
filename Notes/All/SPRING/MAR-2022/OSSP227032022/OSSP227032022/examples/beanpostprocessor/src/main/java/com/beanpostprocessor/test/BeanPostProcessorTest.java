package com.beanpostprocessor.test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.beanpostprocessor.beans.GasStation;
import com.beanpostprocessor.helper.ObjectTracker;

public class BeanPostProcessorTest {
	public static void main(String[] args) {
		/*
		 * DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		 * BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		 * reader.loadBeanDefinitions(new
		 * ClassPathResource("com/beanpostprocessor/common/application-context.xml"));
		 * 
		 * BeanPostProcessor beanPostProcessor =
		 * beanFactory.getBean("objectTickerBeanPostProcessor",
		 * BeanPostProcessor.class);
		 * beanFactory.addBeanPostProcessor(beanPostProcessor);
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/beanpostprocessor/common/application-context.xml");
		System.out.println("object count : " + ObjectTracker.getCounter());
		
		GasStation gasStation = context.getBean("gasStation", GasStation.class);
		context.getBean("gasStation", GasStation.class);

		System.out.println("object count : " + ObjectTracker.getCounter());
	}
}
