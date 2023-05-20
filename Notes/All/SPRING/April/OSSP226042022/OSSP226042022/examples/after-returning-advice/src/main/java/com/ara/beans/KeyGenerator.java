package com.ara.beans;

import java.security.SecureRandom;

public class KeyGenerator {
	public int generateKey(int range) {
		SecureRandom random = null;
		int key = 0;

		random = new SecureRandom();
		key = random.nextInt(range);
		return key;
	}
}
