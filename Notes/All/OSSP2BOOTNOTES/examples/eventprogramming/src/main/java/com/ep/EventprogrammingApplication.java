package com.ep;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ep.service.StatementService;

@SpringBootApplication
public class EventprogrammingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EventprogrammingApplication.class, args);
		StatementService statementService = context.getBean(StatementService.class);
		statementService.emailStatement(LocalDate.of(2022, 03, 01), LocalDate.now(), "bob@gmail.com");
	}

}
