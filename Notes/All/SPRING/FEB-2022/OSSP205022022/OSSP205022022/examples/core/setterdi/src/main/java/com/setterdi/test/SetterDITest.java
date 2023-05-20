package com.setterdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.setterdi.beans.WaterPump;

public class SetterDITest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/setterdi/common/application-context.xml"));
		WaterPump waterPump = beanFactory.getBean("waterPump", WaterPump.class);
		waterPump.on();
	}

}
