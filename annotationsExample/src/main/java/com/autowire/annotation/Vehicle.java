package com.autowire.annotation;
//no source
public class Vehicle {
	private int capacity;
	private String transmission;
	private String fuelType;
	private String color;
	private String type;

	public void setType(String type) {
		this.type = type;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehicle [capacity=" + capacity + ", transmission=" + transmission + ", fuelType=" + fuelType
				+ ", color=" + color + "type=" +type + "]" ;
	}
}
