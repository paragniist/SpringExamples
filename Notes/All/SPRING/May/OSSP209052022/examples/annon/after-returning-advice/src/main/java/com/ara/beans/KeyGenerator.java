package com.ara.beans;

import java.security.SecureRandom;

import org.springframework.stereotype.Component;

@Component
public class KeyGenerator {
	public int generateKey(int range) {
		SecureRandom random = null;
		random = new SecureRandom();
		return random.nextInt(range);
	}
}
