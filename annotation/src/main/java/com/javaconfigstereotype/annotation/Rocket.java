package com.javaconfigstereotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Sourcecode
@Component
public class Rocket {
	@Value("${rocketType}")
	private String rocketType;

	public void setRocketType(String rocketType) {
		this.rocketType = rocketType;
	}

	@Override
	public String toString() {
		return "Rocket [rocketType=" + rocketType + "]";
	}
	
}
