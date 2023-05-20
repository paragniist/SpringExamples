package com.ca.bo;

public class VehicleBo {
	private int vehicleNo;
	private String modelName;
	private String manufacturer;
	private String color;
	private String registrationNo;
	private float leaseAmount;

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public float getLeaseAmount() {
		return leaseAmount;
	}

	public void setLeaseAmount(float leaseAmount) {
		this.leaseAmount = leaseAmount;
	}

	@Override
	public String toString() {
		return "VehicleBo [vehicleNo=" + vehicleNo + ", modelName=" + modelName + ", manufacturer=" + manufacturer
				+ ", color=" + color + ", registrationNo=" + registrationNo + ", leaseAmount=" + leaseAmount + "]";
	}

}
