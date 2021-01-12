package com.javaconcepts.methods;

public class MethodOverriding {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		/*
		 * subClass.method1(); -> This will not compile since this is private to the
		 * superclass
		 */
		subClass.method2();
		subClass.method3();
		System.out.println("*********************************************************");

		SuperClass class1 = new SubClass();
		SuperClass class2 = new SuperClass();
		class1.method2();
		class2.method2();
		System.out.println("*********************************************************");

		/* The below two will not compile */
		// class1.ownMethod();
		// class2.ownMethod();
	}

}
