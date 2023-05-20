package com.annotation5.importannon;

// no source code
public class Telephone {
	private int telephoneNumber;
	private String subscriptionType;

	public Telephone(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	@Override
	public String toString() {
		return "Telephone [telephoneNumber=" + telephoneNumber + ", subscriptionType=" + subscriptionType + "]";
	}

}
