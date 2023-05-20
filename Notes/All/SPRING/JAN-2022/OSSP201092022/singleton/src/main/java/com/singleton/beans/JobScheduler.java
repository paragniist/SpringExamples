package com.singleton.beans;

public class JobScheduler {
	public void execute() {
		DateConverter dc = DateConverter.getInstance();
		System.out.println("DateConverter hashCode: " + dc.hashCode());
	}
}
