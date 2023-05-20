package com.ba.beans;

public class Person {
	private int personNo;
	private String personName;
	private int age;
	private String gender;

	public void setPersonNo(int personNo) {
		this.personNo = personNo;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [personNo=" + personNo + ", personName=" + personName + ", age=" + age + ", gender=" + gender
				+ "]";
	}

}
