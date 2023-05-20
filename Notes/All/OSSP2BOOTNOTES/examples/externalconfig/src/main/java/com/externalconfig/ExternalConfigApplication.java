package com.externalconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.externalconfig.beans.Book;

@SpringBootApplication
public class ExternalConfigApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ExternalConfigApplication.class, args);
		Book book = context.getBean(Book.class);
		System.out.println(book);
	}
}
