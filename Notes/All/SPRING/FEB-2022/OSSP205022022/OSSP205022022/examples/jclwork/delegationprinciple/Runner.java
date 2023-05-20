package com.pcl.delegation;
public class Runner {
	public static void main(String[] args) {
		ClassLoader cl = Runner.class.getClassLoader();
		System.out.println(cl.getClass().getName());
	}
}