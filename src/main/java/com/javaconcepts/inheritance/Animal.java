package com.javaconcepts.inheritance;

public class Animal {
	private String name;
	private int body;
	private int brain;
	private int weight;

	public Animal(String name, int body, int brain, int weight) {
		this.name = name;
		this.body = body;
		this.brain = brain;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("This is inside Animal.eat() method.");
	}

	public void move() {
		System.out.println("This is inside Animal.move() method.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public int getBrain() {
		return brain;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
