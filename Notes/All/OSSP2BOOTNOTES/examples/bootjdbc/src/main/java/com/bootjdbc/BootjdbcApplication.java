package com.bootjdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootjdbc.dto.PassengerDto;
import com.bootjdbc.service.PassengerService;

@SpringBootApplication
public class BootjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjdbcApplication.class, args);
		PassengerService passengerService = context.getBean(PassengerService.class);
		List<PassengerDto> passengerDtos = passengerService.getPassengers();
		passengerDtos.stream().forEach(System.out::println);
	}

}
