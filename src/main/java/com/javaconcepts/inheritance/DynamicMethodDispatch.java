package com.javaconcepts.inheritance;

/**
 * Dynamic Method Dispatch with Method Overriding (Runtime Polymorphism)
 * 
 * @author Sumon Dey
 *
 */
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Figure figure = new Figure(4, 5);
		figure.area();
		System.out.println("****************************************************");
		figure = new Rectangle(2, 3);
		figure.area();
		System.out.println("****************************************************");
		figure = new Triangle(5, 6);
		figure.area();
		System.out.println("****************************************************");
	}

}

// Superclass
class Figure {
	public double length;
	public double breadth;

	public Figure(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		System.out.println("Area of the figure is undefined.");
	}
}

// Subclass to Superclass Figure
class Rectangle extends Figure {

	public Rectangle(double length, double breadth) {
		super(length, breadth);
	}

	@Override
	public void area() {
		System.out.println("Area of the rectangle is: " + (length * breadth));
	}

}

// Subclass to Superclass Figure
class Triangle extends Figure {

	public Triangle(double length, double breadth) {
		super(length, breadth);
	}

	@Override
	public void area() {
		System.out.println("Area of the triangle is: " + ((length * breadth) / 2));
	}

}
