package com.annotation5.xmlstereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// source code
@Component
public class Gear {
	@Autowired
	private ToyCar toyCar;

	public void forward() {
		toyCar.go();
	}
}
