package com.annotation5.javaconfig;

// no source code
public class Tab {
	private Microphone microphone;

	public Tab() {
		System.out.println("tab created");
	}

	public void on() {
		System.out.println("turning on...");
		microphone.capture();
	}

	void setMicrophone(Microphone microphone) {
		this.microphone = microphone;
	}

}
