package com.beanalias.test;

import java.util.stream.Stream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.beanalias.beans.Person;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new DefaultListableBeanFactory();
		BeanDefinitionReader reader=new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/beanalias/common/application-context.xml"));
		
		Person person=beanFactory.getBean("person",Person.class);
		System.out.println(person);
		Stream.of(beanFactory.getAliases("person")).forEach(System.out::println);
			
	}

}
