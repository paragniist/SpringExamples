package com.annotation5.resourceinject;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

public class Radio {
	// @Resource(name="tuner1")
	@Inject
	@Named("tuner1")
	private Tuner tuner;

	public void on() {
		tuner.receive();
		System.out.println("playing ...");
	}

	void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

}
