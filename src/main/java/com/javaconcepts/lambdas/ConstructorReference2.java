package com.javaconcepts.lambdas;

public class ConstructorReference2 {

	public static void main(String[] args) {
		// create a reference to the MyClass2<T> constructor
		MyFunc4<Integer> myClassCons = MyClass2<Integer>::new;
		// create an instance of MyClass2<T> via that constructor reference
		MyClass2<Integer> mc = myClassCons.func(100);
		// use the instance of MyClass2<T> just created
		System.out.println("val in mc is: " + mc.getVal());
	}

}

class MyClass2<T> {
	private T val;

	// a constructor that takes an argument
	public MyClass2(T v) {
		val = v;
	}

	// this is the default constructor
	public MyClass2() {
		val = null;
	}

	public T getVal() {
		return val;
	}
}

// MyFunc4 is now a generic functional interface
interface MyFunc4<T> {
	MyClass2<T> func(T n);
}
