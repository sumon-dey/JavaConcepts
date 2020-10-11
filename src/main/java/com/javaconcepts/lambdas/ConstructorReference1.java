package com.javaconcepts.lambdas;

public class ConstructorReference1 {

	public static void main(String[] args) {
		// create a reference to the MyClass1 constructor. Because func()
		// in MyFunc3 takes an argument, new refers to the parameterized constructor
		// in MyClass1, not the default constructor
		MyFunc3 myClassCons = MyClass1::new;
		// create an instance of MyClass1 via that constructor reference
		MyClass1 mc = myClassCons.func(100);

		// use the instance of MyClass1 just created
		System.out.println("val in mc is: " + mc.getVal());

	}

}

class MyClass1 {
	private int val;

	// this constructor takes an argument
	public MyClass1(int v) {
		val = v;
	}

	// this is the default constructor
	public MyClass1() {
		val = 0;
	}

	public int getVal() {
		return val;
	}

}

// MyFunc3 is a functional interface whose method returns a MyClass1 Reference
interface MyFunc3 {
	MyClass1 func(int n);
}
