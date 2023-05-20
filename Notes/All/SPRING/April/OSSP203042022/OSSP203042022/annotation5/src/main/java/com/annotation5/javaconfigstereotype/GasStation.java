package com.annotation5.javaconfigstereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// source code
@Component
public class GasStation {
	@Value("${gasStation.stationName}")
	private String stationName;
	@Autowired
	private GasPump gasPump;

	@Override
	public String toString() {
		return "GasStation [stationName=" + stationName + ", gasPump=" + gasPump + "]";
	}

}
