package com.coredi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.coredi.beans.MessageWriter;

public class CoreDITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/coredi/common/application-context.xml"));

		MessageWriter messageWriter = beanFactory.getBean("messageWriter", MessageWriter.class);
		/*
		 * IMessageFormatter htmlMessageFormatter =
		 * beanFactory.getBean("htmlMessageFormatter", IMessageFormatter.class);
		 * IMessageFormatter pdfMessageFormatter =
		 * beanFactory.getBean("pdfMessageFormatter", IMessageFormatter.class);
		 * 
		 * messageWriter.setMessageFormatter(pdfMessageFormatter);
		 */		
		messageWriter.writeMessage("Welcome to Spring Framework");

	}
}
