package com.singleton.beans;

public class ToDoManager {
	public void manage() {
		DateConverter dc = DateConverter.getInstance();
		System.out.println("DateConverter hashCode : " + dc.hashCode());
	}
}
