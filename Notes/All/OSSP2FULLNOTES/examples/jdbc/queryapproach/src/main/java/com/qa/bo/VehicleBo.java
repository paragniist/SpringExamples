package com.qa.bo;

import java.util.Objects;

public class VehicleBo {
	private int vehicleNo;
	private String modelName;
	private String manufacturer;
	private String registrationNo;
	private String color;
	private String fuelType;
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

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public float getLeaseAmount() {
		return leaseAmount;
	}

	public void setLeaseAmount(float leaseAmount) {
		this.leaseAmount = leaseAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, fuelType, leaseAmount, manufacturer, modelName, registrationNo, vehicleNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleBo other = (VehicleBo) obj;
		return Objects.equals(color, other.color) && Objects.equals(fuelType, other.fuelType)
				&& Float.floatToIntBits(leaseAmount) == Float.floatToIntBits(other.leaseAmount)
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(modelName, other.modelName)
				&& Objects.equals(registrationNo, other.registrationNo) && vehicleNo == other.vehicleNo;
	}

	@Override
	public String toString() {
		return "VehicleBo [vehicleNo=" + vehicleNo + ", modelName=" + modelName + ", manufacturer=" + manufacturer
				+ ", color=" + color + ", leaseAmount=" + leaseAmount + "]";
	}

}
