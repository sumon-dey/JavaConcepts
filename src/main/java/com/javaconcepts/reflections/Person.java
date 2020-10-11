package com.javaconcepts.reflections;

/* Person Class */
public class Person implements Behavior {
	private String name;
	public int age;
	public double height;

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void hobby() {
		System.out.println("The hobby of the person is coding.");
	}

	public void ethnicity() {
		System.out.println("The ethnicity of the person is Indian.");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

}
