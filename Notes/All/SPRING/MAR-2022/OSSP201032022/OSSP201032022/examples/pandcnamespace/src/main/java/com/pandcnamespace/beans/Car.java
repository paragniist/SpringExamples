package com.pandcnamespace.beans;

public class Car {
	private String regNo;
	private String model;
	private String manufacturer;
	private String color;
	private Engine engine;

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", model=" + model + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", engine=" + engine + "]";
	}

}
