package com.javaconcepts.packagesAndAccessModifiers1;

/**
 * In Java, "package" is a mechanism for naming control and visibility control
 * of the classes, interfaces and its members. Java uses File System directories
 * to store packages.
 * 
 * @author Sumon Dey
 *
 */
public class AccessModifierMainProgram1 {

	public static void main(String[] args) {
		Derived derived = new Derived();
		System.out.println("*********************************");
		Protection protection = new Protection();
		System.out.println("*********************************");
		SamePackage samePackage = new SamePackage();
		System.out.println("*********************************");
	}

}
