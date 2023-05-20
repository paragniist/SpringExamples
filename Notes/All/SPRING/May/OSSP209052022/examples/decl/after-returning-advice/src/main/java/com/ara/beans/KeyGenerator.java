package com.ara.beans;

import java.security.SecureRandom;

public class KeyGenerator {
	public int generateKey(int range) {
		SecureRandom secureRandom = null;
		int key = 0;

		secureRandom = new SecureRandom();
		key = secureRandom.nextInt(range);
		
		return key;
	}
}
