package com.lmi.beans;

abstract public class Car {

	public void drive() {
		IEngine engine = null;

		engine = lookupEngine();
		engine.start();
		System.out.println("driving car");
	}

	abstract public IEngine lookupEngine();
}
