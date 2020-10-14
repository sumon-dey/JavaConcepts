package com.javaconcepts.inheritance;

/**
 * Abstract Class:
 * 
 * Abstract classes are used to define method which they do not implement but
 * forces their subclasses to implement. Object instances of Abstract class
 * cannot be created since the created object will not contain complete
 * information.
 * 
 * @author Sumon Dey
 *
 */
public class AbstractClass {

	public static void main(String[] args) {
		// Figure2 figure2 = new Figure2(2, 3); -> This will throw compile error
		// since we can't create objects of an abstract class
		Figure2 figure2 = new Rectangle2(3, 4);
		// We can use the abstract class type as reference data type though
		figure2.area();
		System.out.println("******************************************************");
		figure2 = new Triangle2(3, 4);
		figure2.area();
		System.out.println("******************************************************");
	}

}

// This superclass is an abstract class since it contains an abstract method
abstract class Figure2 {
	public double length;
	public double breadth;

	public Figure2(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// abstract method
	public abstract void area();

	// concrete method
	public void dimension() {
		System.out.println("The Figure is of two dimension.");
	}
}

class Rectangle2 extends Figure2 {

	public Rectangle2(double length, double breadth) {
		super(length, breadth);
	}

	@Override
	public void area() {
		System.out.println("The area of the rectangle is: " + (length * breadth));
	}

}

class Triangle2 extends Figure2 {

	public Triangle2(double length, double breadth) {
		super(length, breadth);
	}

	@Override
	public void area() {
		System.out.println("The area of the triangle is: " + ((length * breadth) / 2));
	}

}
