package com.javaconcepts.lambdas;

public class ConstructorReference3 {

	public static void main(String[] args) {
		// create a reference to a MyClass3 constructor.
		// In this case, new refers to the constructor that takes an argument
		MyFunc5<MyClass3<Double>, Double> myClassCons = MyClass3<Double>::new;

		// create an instance of MyClass3 by use of the factory method
		MyClass3<Double> mc3 = myClassFactory(myClassCons, 100.1);

		// use the instance of MyClass3 just created
		System.out.println("val in mc3 is: " + mc3.getVal());

		// now, create a different class by use of myClassFactory()
		MyFunc5<MyClass4, String> myClassCons2 = MyClass4::new;

		// create an instance of MyClass4 by use of the factory method
		MyClass4 mc4 = myClassFactory(myClassCons2, "Lambda");

		// use the instance of MyClass3 just created
		System.out.println("str in mc4 is: " + mc4.getVal());
	}

	// a factory method for class objects. The class must have a constructor that
	// takes one parameter of type T. R specifies the type of object being created.
	public static <R, T> R myClassFactory(MyFunc5<R, T> cons, T v) {
		return cons.func(v);
	}

}

// a simple Generic class
class MyClass3<T> {
	private T val;

	// a constructor that takes an argument
	MyClass3(T v) {
		val = v;
	}

	// default constructor
	MyClass3() {
		val = null;
	}

	T getVal() {
		return val;
	}
}

// a simple non-generic class
class MyClass4 {
	String str;

	// a constructor that takes an argument
	MyClass4(String s) {
		str = s;
	}

	// default constructor
	MyClass4() {
		str = "";
	}

	String getVal() {
		return str;
	}

}

interface MyFunc5<R, T> {
	R func(T n);
}
