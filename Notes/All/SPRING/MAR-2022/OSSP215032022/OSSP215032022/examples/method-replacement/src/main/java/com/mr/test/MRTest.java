package com.mr.test;

import java.util.List;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MRTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/mr/common/application-context.xml"));

		PlanFinder planFinder = beanFactory.getBean("planFinder", PlanFinder.class);
		List<String> plans = planFinder.findPlans("2-7", 10, 1, true, 9383);
		plans.stream().forEach(System.out::println);
	}
}
