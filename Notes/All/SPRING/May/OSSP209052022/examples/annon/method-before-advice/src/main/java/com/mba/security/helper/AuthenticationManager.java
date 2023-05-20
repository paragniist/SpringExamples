package com.mba.security.helper;

import com.mba.security.beans.UserCredential;

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
		threadLocal.set(new UserCredential(username, password));
	}

	public void logout() {
		threadLocal.set(null);
	}

	public boolean authenticate() {
		UserCredential uc = null;
		uc = threadLocal.get();
		if (uc != null) {
			if (uc.getUsername().equals("john") && uc.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		UserCredential uc = null;
		uc = threadLocal.get();
		if (uc != null) {
			return uc.getUsername();
		}
		return null;
	}
}
