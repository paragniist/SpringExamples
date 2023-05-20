package com.beanautowiring.beans;

public class TransportType {
	private String transportMode;
	private String vehicleType;

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "TransportType [transportMode=" + transportMode + ", vehicleType=" + vehicleType + "]";
	}

}
