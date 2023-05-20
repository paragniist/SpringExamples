package com.cdi.beans;

public class Staff {
	private int staffNo;
	private String fullname;
	private int age;
	private String gender;

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
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
		return "Staff [staffNo=" + staffNo + ", fullname=" + fullname + ", age=" + age + ", gender=" + gender + "]";
	}

}
