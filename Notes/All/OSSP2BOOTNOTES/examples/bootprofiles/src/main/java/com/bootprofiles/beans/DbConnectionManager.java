package com.bootprofiles.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db")
public class DbConnectionManager {
	private String driverClassname;
	private String url;
	private String username;
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
