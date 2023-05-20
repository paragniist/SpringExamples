package com.annotation5.dependson;

import org.springframework.stereotype.Component;

@Component
public class LoanManager {

	public LoanManager() {
		System.out.println("loan manager created");
	}

}
