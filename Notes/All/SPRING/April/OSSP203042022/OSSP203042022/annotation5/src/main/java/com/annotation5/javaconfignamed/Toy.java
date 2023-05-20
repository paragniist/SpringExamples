package com.annotation5.javaconfignamed;

import javax.inject.Named;

@Named
public class Toy {
	public void on() {
		System.out.println("switched on the toy");
	}
}
