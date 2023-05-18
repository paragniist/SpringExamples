package com.beanalias.beans;

public class Person {
	int uniqueNo;
	String name;
	int age;
	String gender;

	public Person(int uniqueNo, String name, int age, String gender) {
		this.uniqueNo = uniqueNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person ["+uniqueNo+" , "+name+" , "+age+" , "+gender+"]";
	}

}
