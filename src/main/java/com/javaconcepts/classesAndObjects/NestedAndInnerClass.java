/*Nested and Inner Classes*/
/*Nested Classes are classes within a class. Nested Classes can be both static and non-static. Static Nested Classes
 * are seldom used since they cannot access non-static members of the outer classes. Non-Static Nested Classes are 
 * known as Inner Classes*/
package com.javaconcepts.classesAndObjects;

public class NestedAndInnerClass {

	public static void main(String[] args) {
		Shop myNewShop = new Shop();
		myNewShop.callSmallShop();
	}

}

// Outer class
class Shop {
	private String color = "Blue";

	// Inner Class
	class SmallShop {
		void display() {
			System.out.println("Inside the inner class: The color of the shop is \"" + color + "\"");
		}
	}

	// method in the outer class which creates an instance of the inner class
	// and calls the display method
	public void callSmallShop() {
		SmallShop smallShop = new SmallShop();
		smallShop.display();
	}

}
