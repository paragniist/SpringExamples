package com.javaconfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javaconfig.beans.JavaConfig;
import com.javaconfig.beans.Parag;

public class JavaConfigTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Parag obj=context.getBean("newParag",Parag.class);
		obj.traveller();
		

	}

}
