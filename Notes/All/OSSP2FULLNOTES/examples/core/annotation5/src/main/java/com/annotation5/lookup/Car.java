package com.annotation5.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class Car {

	public void drive() {
		IEngine engine = null;
		engine = lookupEngine();
		engine.start();
		System.out.println("driving car...");
	}

	@Lookup("yamahaEngineImpl")
	public abstract IEngine lookupEngine();
}
