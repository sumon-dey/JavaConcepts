package com.javaconcepts.lambdas;

import java.util.ArrayList;
import java.util.Collections;

public class StaticMethodReference2 {

	public static void main(String[] args) {
		ArrayList<MyClass> al = new ArrayList<MyClass>() {
			{
				add(new MyClass(1));
				add(new MyClass(4));
				add(new MyClass(2));
				add(new MyClass(9));
				add(new MyClass(3));
				add(new MyClass(7));
			}
		};

		// find the maximum value in al using the compareMC() method
		MyClass maxValObj = Collections.max(al, StaticMethodReference2::compareMC);
		System.out.println("Maximum value is: " + maxValObj.getVal());

	}

	// a compare() method compatible with the one defined by Comparator<T>.
	public static int compareMC(MyClass a, MyClass b) {
		return a.getVal() - b.getVal();
	}

}

class MyClass {
	private int val;

	public MyClass(int v) {
		val = v;
	}

	public int getVal() {
		return val;
	}
}
