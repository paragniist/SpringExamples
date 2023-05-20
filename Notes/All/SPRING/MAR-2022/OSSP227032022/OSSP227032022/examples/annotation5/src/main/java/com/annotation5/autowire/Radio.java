package com.annotation5.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Radio {
	private Tuner tuner;

	public Radio() {
		super();
	}

	@Autowired(required = false)
	public Radio(Tuner tuner) {
		this.tuner = tuner;
	}

	@Override
	public String toString() {
		return "Radio [tuner=" + tuner + "]";
	}

}
