package com.annotation5.autowire;

public class Tuner {
	private String tunerType;

	public void setTunerType(String tunerType) {
		this.tunerType = tunerType;
	}

	@Override
	public String toString() {
		return "Tuner [tunerType=" + tunerType + "]";
	}

}
