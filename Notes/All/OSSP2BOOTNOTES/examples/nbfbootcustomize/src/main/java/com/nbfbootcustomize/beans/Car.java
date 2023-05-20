package com.nbfbootcustomize.beans;

public class Car {
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}

}
