package com.annotation4.required;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ReqTest {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/annotation4/required/required-beans.xml");
		 */
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/annotation4/required/required-beans.xml"));
		BeanPostProcessor bpp = beanFactory.getBean("rbpp", BeanPostProcessor.class);
		((ConfigurableListableBeanFactory) beanFactory).addBeanPostProcessor(bpp);
		
		Microprocessor microprocessor = beanFactory.getBean("microprocessor", Microprocessor.class);
		System.out.println(microprocessor);
	}
}














