package com.annotation5.importresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// source code
@Component
public class RoomHeater {
	@Autowired
	private Thermostat thermostat;

	public void on(int degrees) {
		System.out.println("turned on at temparature : " + degrees);
		thermostat.setTemparature(degrees);
	}
}
