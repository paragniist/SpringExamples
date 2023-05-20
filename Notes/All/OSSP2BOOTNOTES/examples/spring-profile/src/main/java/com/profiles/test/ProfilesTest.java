package com.profiles.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.profiles.beans.DbConnectionManager;
import com.profiles.config.DevConfig;
import com.profiles.config.TestConfig;

public class ProfilesTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// context.getEnvironment().setActiveProfiles("test");
		context.register(DevConfig.class, TestConfig.class);
		context.refresh();
		DbConnectionManager dbConnectionManager = context.getBean(DbConnectionManager.class);
		System.out.println(dbConnectionManager);
	}
}
