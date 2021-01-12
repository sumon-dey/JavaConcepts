package com.javaconcepts.classesAndObjects;

/**
 * Nested and Inner Classes:
 * 
 * Nested Classes are classes within a class. Nested Classes can be both static
 * and non-static. Static Nested Classes are seldom used since they cannot
 * access non-static members of the outer class. Non-Static Nested Classes are
 * also known as Inner Classes and can access both static and non-static members
 * of the outer class.
 * 
 * @author Sumon Dey
 *
 */
public class NestedAndInnerClass {

	public static void main(String[] args) {
		Shop myNewShop = new Shop();
		myNewShop.callLargeShop();
		myNewShop.callSmallShop();
		/*
		 * We cannot create objects of the nested classes directly outside the outer
		 * class. We have to create object of the outer class and then can call only the
		 * non-static nested (inner) classes (not static nested classes) using it.
		 */
		myNewShop.new SmallShop();
	}

}

// Outer class
class Shop {
	private String color = "Blue";

	// static nested class
	/*
	 * We have to create an object of the outer class to call a non-static member of
	 * the outer class from inside the static nested class
	 */
	static class LargeShop {
		void display() {
			System.out.println("Inside the static nested class: The color of the shop is \"" + new Shop().color + "\"");
		}
	}

	// non-static nested class (Inner Class)
	/*
	 * We can directly call a static/non-static member of the outer class, without
	 * creating an object of the outer class, from inside the non-static nested
	 * class (inner class)
	 */
	class SmallShop {
		void display() {
			System.out.println(
					"Inside the non-static nested class (inner class): The color of the shop is \"" + color + "\"");
		}
	}

	/*
	 * method in the outer class which creates an instance of the non-static nested
	 * class (Inner Class) and calls its display method
	 */
	public void callSmallShop() {
		SmallShop smallShop = new SmallShop();
		smallShop.display();
	}

	/*
	 * method in the outer class which calls the static nested class and calls its
	 * display method
	 */
	public void callLargeShop() {
		LargeShop largeShop = new LargeShop();
		largeShop.display();
	}

}
