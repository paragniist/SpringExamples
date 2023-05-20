package com.annotation5.importresource;

// no source code
public class Thermostat {
	private HeatingElement heatingElement;

	public void setTemparature(int degrees) {
		System.out.println("setting heating element to temperature : " + degrees);
		heatingElement.heat(degrees);
	}

	public void setHeatingElement(HeatingElement heatingElement) {
		this.heatingElement = heatingElement;
	}

}
