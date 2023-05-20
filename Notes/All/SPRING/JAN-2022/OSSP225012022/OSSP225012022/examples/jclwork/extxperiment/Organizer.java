package com.extcl.beans;
public class Organizer {
	public static void main(String[] args) {
		ClassLoader cl = Organizer.class.getClassLoader(); // reference of ClassLoader who has loaded Organizer.class into jvm
		String clName = cl.getClass().getName();
		System.out.println("classloader name : " + clName);
	}
}