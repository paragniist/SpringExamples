package com.beanautowiring.beans;

public class Distributor {
	private String udno;
	private String distributorName;

	public Distributor(String udno) {
		this.udno = udno;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	@Override
	public String toString() {
		return "Distributor [udno=" + udno + ", distributorName=" + distributorName + "]";
	}

}
