package com.javaconcepts.collection;

import java.util.ArrayList;

/*In Java, an Array is of fixed-length which means that it cannot grow and shrink. Hence, it is required to know how many
 * elements the Array can hold beforehand and the Array size cannot be modified during runtime*/

/*An ArrayList supports dynamic array that can increase and decrease as needed. An ArrayList is a variable-length array
 * of Object references which can dynamically increase or decrease in size.*/

/*The "ArrayList" class extends the "AbstractList" class and implements the "List" interface*/

public class ArrayListDemo {

	public static void main(String[] args) {
		// create an ArrayList
		ArrayList<String> myArrayList1 = new ArrayList<String>();
		System.out.println("Initial size of myArrayList: " + myArrayList1.size());
		// add elements to the ArrayList
		myArrayList1.add("C");
		myArrayList1.add("A");
		myArrayList1.add("E");
		myArrayList1.add("B");
		myArrayList1.add("D");
		myArrayList1.add("F");
		myArrayList1.add(1, "A2");
		System.out.println("Size of myArrayList after additions: " + myArrayList1.size());
		// display the ArrayList
		System.out.println("Contents of myArrayList: " + myArrayList1);
		// remove elements from the ArrayList
		myArrayList1.remove("F");
		myArrayList1.remove(2);
		System.out.println("Size of myArrayList after deletions: " + myArrayList1.size());
		// display the ArrayList
		System.out.println("Contents of myArrayList: " + myArrayList1);

		// ensureCapacity() -> to ensure the minimum capacity that the ArrayList should
		// possess and thereby
		// decreasing the number of reallocations and hence improving performance
		myArrayList1.ensureCapacity(42);
		System.out.println("After ensuring capacity: " + myArrayList1);
		// trimToSize() -> to make the ArrayList precisely as large as the number of
		// items it is currently holding
		myArrayList1.trimToSize();
		System.out.println("After trimming to size: " + myArrayList1);
		System.out.println("*******************************************************");

		// Converting an "ArrayList" to "Array"
		ArrayList<Integer> myArrayList2 = new ArrayList<Integer>();
		myArrayList2.add(5);
		myArrayList2.add(4);
		myArrayList2.add(3);
		myArrayList2.add(2);
		myArrayList2.add(1);
		Integer[] myIntegerArray = new Integer[myArrayList2.size()];
		myIntegerArray = myArrayList2.toArray(myIntegerArray);

		for (int element : myIntegerArray) {
			System.out.println(element);
		}

	}

}
