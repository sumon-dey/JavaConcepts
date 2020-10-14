package com.javaconcepts.dataFormats;

/**
 * This is a POJO (Plain Old Java Object) class
 * 
 * @author Sumon Dey
 *
 */
public class Person {
	private String name;
	private int age;
	private String address;
	private double height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
