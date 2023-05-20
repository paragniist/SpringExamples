package com.goair;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.goair.dto.PassengerDto;
import com.goair.service.PassengerService;

@SpringBootApplication
public class GoairApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GoairApplication.class, args);
		PassengerService passengerService = context.getBean(PassengerService.class);
		List<PassengerDto> passengerDtos = passengerService.getPassengersByAge(22);
		passengerDtos.stream().forEach(System.out::println);
	}

}
