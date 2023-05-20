package com.bootprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootprofiles.beans.DbConnectionManager;

@SpringBootApplication
public class BootprofilesApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BootprofilesApplication.class, args);
		DbConnectionManager dbConnectionManager = applicationContext.getBean(DbConnectionManager.class);
		System.out.println(dbConnectionManager);
	}
}
