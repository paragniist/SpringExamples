package com.annotation5.stereotype;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sportsBike")
// @Lazy
// @Scope("prototype")
public class Bike {
	public void init() {
		System.out.println("post construction logic");
	}

	public Bike() {
		System.out.println("bike created");
	}

	public void ride() {
		System.out.println("riding bike");
	}

	public void release() {
		System.out.println("pre-destruction logic");
	}
}
