package com.primitivedi.beans;

public class Bike {
	private String chasisNo;
	private String engineNo;
	private String rtaRegistrationNo;
	private String color;
	private String fuelType;

	public Bike(String chasisNo, String engineNo, String rtaRegistrationNo) {
		this.chasisNo = chasisNo;
		this.engineNo = engineNo;
		this.rtaRegistrationNo = rtaRegistrationNo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Bike [chasisNo=" + chasisNo + ", engineNo=" + engineNo + ", rtaRegistrationNo=" + rtaRegistrationNo
				+ ", color=" + color + ", fuelType=" + fuelType + "]";
	}

}
