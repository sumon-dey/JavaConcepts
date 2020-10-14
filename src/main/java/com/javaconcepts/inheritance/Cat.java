package com.javaconcepts.inheritance;

public class Cat extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Cat(String name, int weight, int eyes, int legs, int tail, int teeth) {
		super(name, 1, 1, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
	}

	@Override
	public void eat() {
		System.out.println("This is inside Cat.eat() method.");
	}

	public void run() {
		System.out.println("This is inside Cat.run() method.");
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

}
