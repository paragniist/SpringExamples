package com.mba.security.helper;

import com.mba.security.beans.UserCredentials;

public class AuthenticationManager {
	private static AuthenticationManager instance;
	private ThreadLocal<UserCredentials> userCredentialsLocal;

	private AuthenticationManager() {
		userCredentialsLocal = new ThreadLocal<UserCredentials>();
	}

	public static synchronized AuthenticationManager getInstance() {
		if (instance == null) {
			instance = new AuthenticationManager();
		}
		return instance;
	}

	public void login(String username, String password) {
		userCredentialsLocal.set(new UserCredentials(username, password));
	}

	public void logout() {
		userCredentialsLocal.set(null);
	}

	public boolean authenticate() {
		UserCredentials userCredentials = null;

		userCredentials = userCredentialsLocal.get();
		if (userCredentials != null) {
			if (userCredentials.getUsername().equals("philip") && userCredentials.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		UserCredentials userCredentials = null;

		userCredentials = userCredentialsLocal.get();
		if (userCredentials != null) {
			return userCredentials.getUsername();
		}
		return null;
	}
}
