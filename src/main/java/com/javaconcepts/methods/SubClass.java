package com.javaconcepts.methods;

public class SubClass extends SuperClass {

	@Override
	public void method2() {
		System.out.println("Inside method2 of subclass");
	}

	public void ownMethod() {
		System.out.println("Inside ownMethod of subclass");
	}

}
