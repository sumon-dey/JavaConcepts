package com.javaconcepts.inheritance;

public class Fish extends Animal {
	private int gills;
	private int eyes;
	private int fins;

	public Fish(String name, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}

	public void swim() {
		System.out.println("This is inside Fish.swim() method.");
	}

	public int getGills() {
		return gills;
	}

	public void setGills(int gills) {
		this.gills = gills;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

}
