package com.annotation4.required;

import org.springframework.beans.factory.annotation.Required;

public class Microprocessor {
	private String processorType;
	private String manufacturer;
	private int generation;

	@Required
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	@Required
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	@Override
	public String toString() {
		return "Microprocessor [processorType=" + processorType + ", manufacturer=" + manufacturer + ", generation="
				+ generation + "]";
	}

}
