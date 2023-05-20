package com.gotrucks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gotrucks.service.LocationService;

@SpringBootApplication
public class GotrucksApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GotrucksApplication.class, args);

		LocationService locationService = context.getBean(LocationService.class);
		String routeNo = locationService.begin("d93893", 92.3, 938.3939);
		locationService.hop(routeNo, 383.33, 3989.333);
	}

}
