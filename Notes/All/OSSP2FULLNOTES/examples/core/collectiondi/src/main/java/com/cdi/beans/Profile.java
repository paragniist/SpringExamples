package com.cdi.beans;

import java.util.Properties;

public class Profile {
	private String fullname;
	private int age;
	private Properties wishList;

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWishList(Properties wishList) {
		this.wishList = wishList;
	}

	@Override
	public String toString() {
		return "Profile [fullname=" + fullname + ", age=" + age + ", wishList=" + wishList + "]";
	}

}
