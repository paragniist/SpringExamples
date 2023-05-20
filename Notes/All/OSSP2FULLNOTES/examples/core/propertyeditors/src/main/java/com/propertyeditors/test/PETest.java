package com.propertyeditors.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.propertyeditors.beans.FacebookAccount;

public class PETest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/propertyeditors/common/application-context.xml"));
		FacebookAccount fb = beanFactory.getBean("facebookAccount", FacebookAccount.class);
		System.out.println(fb);
	}
}
