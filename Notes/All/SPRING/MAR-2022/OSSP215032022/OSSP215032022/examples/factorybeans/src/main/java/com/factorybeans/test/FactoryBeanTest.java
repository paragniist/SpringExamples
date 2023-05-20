package com.factorybeans.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.factorybeans.beans.Meeting;

public class FactoryBeanTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/factorybeans/common/application-context.xml"));
		/*
		 * Meeting meeting = beanFactory.getBean("meeting", Meeting.class);
		 * System.out.println(meeting);
		 */
		Calendar calendar1 = beanFactory.getBean("meetingTime", Calendar.class);
		Calendar calendar2 = beanFactory.getBean("meetingTime", Calendar.class);

		System.out.println("calendar1 == calendar2 ? : " + (calendar1 == calendar2));
	}
}
