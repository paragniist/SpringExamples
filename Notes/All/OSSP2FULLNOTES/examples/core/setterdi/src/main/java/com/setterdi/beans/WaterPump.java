package com.setterdi.beans;

public class WaterPump {
	private Motor motor;

	// ctrl + shift + o = enter
	public WaterPump(Motor motor) {
		this.motor = motor;
	}

	public void on() {
		motor.run();
	}

	/*
	 * public void setMotor(Motor motor) { this.motor = motor; }
	 */

	// alt + shift + s (r)
	// alt + l
	// alt + r
}
