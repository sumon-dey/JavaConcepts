package com.javaconcepts.packagesAndAccessModifiers1;

public class Test {

	public static void main(String[] args) {
		Derived derived = new Derived();
		System.out.println("*********************************");
		Protection protection = new Protection();
		System.out.println("*********************************");
		SamePackage samePackage = new SamePackage();
		System.out.println("*********************************");
	}

}
