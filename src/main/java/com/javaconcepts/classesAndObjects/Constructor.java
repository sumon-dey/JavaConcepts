package com.javaconcepts.classesAndObjects;

/**
 * Default Constructor and Parameterized Constructor
 * 
 * @author Sumon Dey
 *
 */
public class Constructor {

	public static void main(String[] args) {
		GiftBox myGiftBox1 = new GiftBox();
		System.out.println("Width of the first object: " + myGiftBox1.getWidth());
		System.out.println("Width of the first object: " + myGiftBox1.getHeight());
		System.out.println("Width of the first object: " + myGiftBox1.getDepth());
		System.out.println("**************************************************");
		GiftBox myGiftBox2 = new GiftBox(5.2, 4, 3.3);
		System.out.println("Width of the first object: " + myGiftBox2.getWidth());
		System.out.println("Width of the first object: " + myGiftBox2.getHeight());
		System.out.println("Width of the first object: " + myGiftBox2.getDepth());
		System.out.println("**************************************************");
	}

}

class GiftBox {
	private double width;
	private double height;
	private double depth;

	// Default Constructor
	public GiftBox() {
		System.out.println("Default Constructor called.");
	}

	// Parameterized Constructor
	// Instance Variable hiding by Local Variable
	public GiftBox(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		System.out.println("Parameterized Constructor called.");
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	public double getDepth() {
		return this.depth;
	}

}
