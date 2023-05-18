package com.profiles.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Sourcecode
@Component
public class FuelTank {
	@Value("${fuelType}")
	private String fuelType;
	@Value("${capacity}")
	private int capacity;
	@Override
	public String toString() {
		return "FuelTank [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}
}
