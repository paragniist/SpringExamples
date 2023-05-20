package com.cbc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {
	@Value("${fuelType}")
	private String fuelType;

	public Motor() {
		System.out.println("Motor created...");
	}

	@Override
	public String toString() {
		return "Motor [fuelType=" + fuelType + "]";
	}

}
