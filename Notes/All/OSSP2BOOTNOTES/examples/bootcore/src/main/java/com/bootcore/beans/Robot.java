package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Value("${model}")
	private String model;
	@Value("${cpus}")
	private int cpus;
	@Value("${memory}")
	private int memory;

	@Autowired
	private Sensor sensor;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCpus() {
		return cpus;
	}

	public void setCpus(int cpus) {
		this.cpus = cpus;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Robot [model=" + model + ", cpus=" + cpus + ", memory=" + memory + ", sensor=" + sensor + "]";
	}

}
