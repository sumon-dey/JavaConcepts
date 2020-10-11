package com.javaconcepts.ioAndSerialization;

public class InstanceOfDemo {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		if (a instanceof A) {
			System.out.println("a is instance of A");
		}
		if (b instanceof B) {
			System.out.println("b is instance of B");
		}
		if (c instanceof C) {
			System.out.println("c is instance of C");
		}
		if (d instanceof D) {
			System.out.println("d is instance of D");
		}
		System.out.println("*******************************************");
		if (c instanceof A) {
			System.out.println("c can be cast to A");
		}
		if (a instanceof C) {
			System.out.println("a can be cast to C");
		}
		System.out.println("*******************************************");
		A ob = d; // A reference to d
		System.out.println("ob now refers to d");
		if (ob instanceof D) {
			System.out.println("ob is instance of D");
		}
		System.out.println("*******************************************");
		ob = c; // A reference to c
		System.out.println("ob now refers to c");
		if (ob instanceof D) {
			System.out.println("ob can be cast to D");
		} else {
			System.out.println("ob cannot be cast to D");
		}
		if (ob instanceof A) {
			System.out.println("ob can be cast to A");
		}
		System.out.println("*******************************************");
		// all objects can be cast to Object
		if (a instanceof Object) {
			System.out.println("a can be cast to Object");
		}
		if (b instanceof Object) {
			System.out.println("b can be cast to Object");
		}
		if (c instanceof Object) {
			System.out.println("c can be cast to Object");
		}
		if (d instanceof Object) {
			System.out.println("d can be cast to Object");
		}
		System.out.println("*******************************************");
	}

}

class A {
	int i, j;
}

class B {
	int i, j;
}

class C extends A {
	int k;
}

class D extends A {
	int k;
}
