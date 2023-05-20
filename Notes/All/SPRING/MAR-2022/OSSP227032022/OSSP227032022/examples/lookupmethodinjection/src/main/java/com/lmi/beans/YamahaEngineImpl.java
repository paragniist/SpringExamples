package com.lmi.beans;

public class YamahaEngineImpl implements IEngine {

	@Override
	public void start() {
		System.out.println("starting yamaha engine : " + this.hashCode());
	}

}
