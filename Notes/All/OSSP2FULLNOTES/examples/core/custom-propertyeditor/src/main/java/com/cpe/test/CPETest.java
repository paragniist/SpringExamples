package com.cpe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cpe.beans.NavigationMap;
import com.cpe.editors.GlobalPropertyEditorRegistrar;

public class CPETest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/cpe/common/application-context.xml"));
		
		((ConfigurableListableBeanFactory)beanFactory).addPropertyEditorRegistrar(new GlobalPropertyEditorRegistrar());
		
		NavigationMap nMap = beanFactory.getBean("navigationMap", NavigationMap.class);
		System.out.println(nMap);
	}
}
