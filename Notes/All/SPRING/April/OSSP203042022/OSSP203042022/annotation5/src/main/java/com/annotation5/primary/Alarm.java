package com.annotation5.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// source code
@Component
public class Alarm {
	@Autowired
	private Bell bell;

	public void remind() {
		bell.ring();
	}
}
