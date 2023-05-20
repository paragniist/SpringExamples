package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sensor {
	@Value("${sensorType}")
	private String sensorType;
	@Value("${range}")
	private int range;

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Sensor [sensorType=" + sensorType + ", range=" + range + "]";
	}

}
