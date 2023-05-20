package com.cdi.beans;

public class Person {
	private String uidai;
	private String fullname;
	private int age;
	private String gender;

	public Person(String uidai) {
		this.uidai = uidai;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [uidai=" + uidai + ", fullname=" + fullname + ", age=" + age + ", gender=" + gender + "]";
	}

}
