/*Instance vs Static Methods Demo */
/*Instance vs Static Variables Demo*/
package com.javaconcepts.classesAndObjects;

public class InstanceVsStatic {
	private static int staticNum;
	private static String staticName;
	private int nonStaticNum;
	private String nonStaticName;

	public static void main(String[] args) {
		/* Difference between a static and an instance method */
		/* To call a static method */
		InstanceVsStatic.staticMethodExample();
		System.out.println("***************************************************************");
		/* To call an instance method */
		InstanceVsStatic object = new InstanceVsStatic();
		object.instanceMethodExample();
		System.out.println("***************************************************************");

		/* Difference between a static and an instance variable */
		Dog oscar = new Dog("Oscar", "brown");
		Dog coco = new Dog("Coco", "black");
		oscar.displayName();
		oscar.displayColor();
		coco.displayName();
		coco.displayColor();
		System.out.println("***************************************************************");
	}

	/* Example of a static method */
	public static void staticMethodExample() {
		System.out.println("This statement is inside the static method of the class.");
		System.out.println(staticNum);
		System.out.println(staticName);
		/* Cannot call non static from static */
		// System.out.println(nonStaticNum);
		// System.out.println(nonStaticName);
	}

	/* Example of an instance method */
	public void instanceMethodExample() {
		System.out.println("This statement is inside the instance method of the class.");
		System.out.println(staticNum);
		System.out.println(staticName);
		System.out.println(nonStaticNum);
		System.out.println(nonStaticName);
	}

}

class Dog {
	/* Static Variable */
	private static String name;
	/* Instance Variable */
	private String color;

	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void displayName() {
		System.out.println("The name of the dog is: " + name);
	}

	public void displayColor() {
		System.out.println("The color of the dog is: " + color);
	}
}
