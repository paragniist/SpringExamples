package com.beanscopes.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.beanscopes.beans.FuelTank;

public class BeanScopesTest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new DefaultListableBeanFactory();
		BeanDefinitionReader reader=new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/beanscopes/common/application-context.xml"));
		
		FuelTank fuelTank1=beanFactory.getBean("fueltank",FuelTank.class);
		FuelTank fuelTank2=beanFactory.getBean("fueltank",FuelTank.class);
		System.out.println("fueltank1==fueltank2? "+(fuelTank1==fuelTank2));
	}

}

/* bean scopes: the scope of a bean within the entire application till its termination defines bean scopes.
 	there are 5 types of scopes applicable for a bean:
 	1.singleton(creating single bean at container level throughout application)
 	2.prototype(creating multiple bean objects, one bean object per request)
 	3.session 
 	4.request
 	5.global(depricated)
 	
 	*/















