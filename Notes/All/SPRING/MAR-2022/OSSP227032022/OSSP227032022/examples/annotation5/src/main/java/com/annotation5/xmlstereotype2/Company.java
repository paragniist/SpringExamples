package com.annotation5.xmlstereotype2;

// no source code
public class Company {
	private String companyName;
	private String location;

	public Company(String companyName) {
		this.companyName = companyName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", location=" + location + "]";
	}

}
