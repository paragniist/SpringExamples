package com.ba.helper;

import com.ba.beans.UserCredential;

public class AuthenticationManager {
	private static AuthenticationManager instance;
	private ThreadLocal<UserCredential> threadLocal;

	private AuthenticationManager() {
		threadLocal = new ThreadLocal<UserCredential>();
	}

	public static synchronized AuthenticationManager getInstance() {
		if (instance == null) {
			instance = new AuthenticationManager();
		}
		return instance;
	}

	public void login(String username, String password) {
		UserCredential userCredential = null;

		userCredential = new UserCredential(username, password);
		threadLocal.set(userCredential);
	}

	public void logout() {
		threadLocal.set(null);
	}

	public boolean authenticate() {
		UserCredential userCredential = null;

		userCredential = threadLocal.get();
		if (userCredential != null) {
			if (userCredential.getUsername().equals("blake") && userCredential.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		UserCredential userCredential = null;

		userCredential = threadLocal.get();
		if (userCredential != null) {
			return userCredential.getUsername();
		}
		return null;
	}
}
