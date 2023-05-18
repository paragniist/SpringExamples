package com.javaconfigstereotype.annotation;
//no source
public class Launcher {
	private Rocket rocket;

	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}

	@Override
	public String toString() {
		return "Launcher [rocket=" + rocket + "]";
	}
	
	
}
