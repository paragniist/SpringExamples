package com.beanscopes.beans;

public class FuelTank {
	private int capacity;
	private String fuelType;
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "FuelTank [capacity=" + capacity + ", fuelType=" + fuelType + "]";
	}
	
	
}
