package com.appcl.beans;
public class Meeting {
	public static void main(String[] args) {
		ClassLoader cl = Meeting.class.getClassLoader();
		System.out.println("classloader name : " + cl.getClass().getName());
	}
}