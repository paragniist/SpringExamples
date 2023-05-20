package com.profiles.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConnectionManager {
	@Value("${db.driverClassname}")
	private String driverClassname;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;

	public String getDriverClassname() {
		return driverClassname;
	}

	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DbConnectionManager [driverClassname=" + driverClassname + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}

}
