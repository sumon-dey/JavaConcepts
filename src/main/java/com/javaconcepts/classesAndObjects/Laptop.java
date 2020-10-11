/*POJO (Plain Old Java Object) class and Access Modifiers*/
package com.javaconcepts.classesAndObjects;

public class Laptop {
	/*
	 * Access of "private" access modifiers is restricted to the class level and
	 * is not accessible beyond that.
	 */
	private String manufacturer;
	private String color;
	private double displaySize;
	private int memory;
	/*
	 * If access modifier is "protected" then the access level is unrestricted
	 * to all the classes within the same package and also to the classes which
	 * are subclasses to this class, and outside of this package.
	 */
	protected int batteryLife;
	/*
	 * If access modifier is not explicitly specified, then it is considered as
	 * a "default" access modifier and the access level is within the package
	 * only and not beyond that.
	 */
	double weight;

	/*
	 * Access of "public" access modifiers is unrestricted and is accessible in
	 * this project as well as in other projects.
	 */
	public Laptop(String manufacturer, String color, double displaySize, int memory, int batteryLife, double weight) {
		/* The keyword "this" refers to the current object */
		this.manufacturer = manufacturer;
		this.color = color;
		this.displaySize = displaySize;
		this.memory = memory;
		this.batteryLife = batteryLife;
		this.weight = weight;
	}

	/* The Getters and the Setters */
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
