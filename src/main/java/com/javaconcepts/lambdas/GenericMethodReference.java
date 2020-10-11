package com.javaconcepts.lambdas;

/*Demonstrate a method reference to a generic method declared inside a non-generic class*/
public class GenericMethodReference {

	public static void main(String[] args) {
		Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
		String[] strs = { "One", "Two", "Three", "Two" };
		int count;

		count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
		System.out.println("vals contains: " + count + " 4s");

		count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
		System.out.println("strs contains: " + count + " Twos");
	}

	// this method has the MyFunc functional interface as the typr of its
	// first parameter . The other two parameters receive an array and a value (both
	// of Type T)
	static <T> int myOp(MyFunc2<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}

}

// this class defines a method called countMatching() that returns the number of
// items in an array that are equal to a specified value. Notice that, countMatching()
// is generic, but MyArrayOps is not
class MyArrayOps {
	static <T> int countMatching(T[] vals, T v) {
		int count = 0;
		for (int i = 0; i < vals.length; i++) {
			if (vals[i] == v) {
				count++;
			}
		}
		return count;
	}
}

// a functional interface that operates on an array and a value and returns an int result
interface MyFunc2<T> {
	int func(T[] vals, T v);
}
