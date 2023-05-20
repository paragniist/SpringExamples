package com.pandcnamespace.beans;

public class Engine {
	private int engineId;
	private String model;

	public Engine(int engineId, String model) {
		this.engineId = engineId;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", model=" + model + "]";
	}

}
