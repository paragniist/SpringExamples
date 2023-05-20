package com.nbfbootcustomize.beans;

public class Engine {
	private String engineType;
	private int capacity;

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", capacity=" + capacity + "]";
	}

}
