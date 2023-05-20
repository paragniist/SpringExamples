package com.annotation5.xmlstereotype2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlStereotypeAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/annotation5/xmlstereotype2/xmlstereotype2-beans.xml");
		Job job = context.getBean("job", Job.class);
		System.out.println(job);

	}
}
