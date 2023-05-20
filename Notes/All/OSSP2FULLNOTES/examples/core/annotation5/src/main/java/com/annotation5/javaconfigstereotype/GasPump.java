package com.annotation5.javaconfigstereotype;

// no source code
public class GasPump {
	private int pumpNo;
	private String fuelType;

	void setPumpNo(int pumpNo) {
		this.pumpNo = pumpNo;
	}

	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "GasPump [pumpNo=" + pumpNo + ", fuelType=" + fuelType + "]";
	}

}
