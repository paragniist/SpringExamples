package com.bfpp.test;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bfpp.beans.ConnectionManager;

public class BFPPTest {
	public static void main(String[] args) {
		/*
		 * DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		 * BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		 * reader.loadBeanDefinitions(new
		 * ClassPathResource("com/bfpp/common/application-context.xml"));
		 * 
		 * BeanFactoryPostProcessor bfpp = beanFactory.getBean("ppc",
		 * BeanFactoryPostProcessor.class); bfpp.postProcessBeanFactory(beanFactory);
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bfpp/common/application-context.xml");

		ConnectionManager cm = context.getBean("connectionManager", ConnectionManager.class);
		System.out.println(cm);
	}
}












