package com.sfmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfmi.beans.JobScheduler;

public class SFMITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/sfmi/common/application-context.xml"));
		JobScheduler jobScheduler = beanFactory.getBean("jobScheduler", JobScheduler.class);
		System.out.println(jobScheduler);
	}
}
