package com.nbf.beans;

public class Motor {
	private String serialNo;
	private FuelTank fuelTank;

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}

	@Override
	public String toString() {
		return "Motor [serialNo=" + serialNo + ", fuelTank=" + fuelTank + "]";
	}

}
