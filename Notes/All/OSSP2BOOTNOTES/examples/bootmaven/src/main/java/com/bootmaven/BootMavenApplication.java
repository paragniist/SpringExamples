package com.bootmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootmaven.beans.FuelTank;

@SpringBootApplication
public class BootMavenApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootMavenApplication.class, args);
		FuelTank fuelTank = context.getBean(FuelTank.class);
		System.out.println(fuelTank);
	}
}
