package com.annotation5.importresource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportResourceTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ImportResourceJavaConfig.class);
		RoomHeater roomHeater = context.getBean("roomHeater", RoomHeater.class);
		roomHeater.on(80);
	}
}
