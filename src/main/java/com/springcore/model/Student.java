package com.springcore.model;

public class Student {

	private String name;

	public Student() {
		System.out.println("In constructor...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
