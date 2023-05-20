package com.annotation5.javaconfig2;

// no source code
public class Powerstation {
	private Turbine turbine;

	public Powerstation(Turbine turbine) {
		this.turbine = turbine;
	}

	public void on() {
		turbine.produce();
	}
}
