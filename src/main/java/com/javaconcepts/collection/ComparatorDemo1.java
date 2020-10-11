package com.javaconcepts.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo1 {
	/*
	 * "Comparator" is a Generic interface. By default, Java stores the elements in
	 * TreeSet and TreeMap in sorted order of natural ordering e.g. A before B, 1
	 * before 2 and so forth. The "Comparator" interface helps us to govern the way
	 * elements are stored within sorted collections and maps. By implementing the
	 * compare() method, we can alter the way the objects are ordered.
	 */
	public static void main(String[] args) {
		TreeSet<String> myTreeSet1 = new TreeSet<String>(new MyCustomComparator1());
		myTreeSet1.add("C");
		myTreeSet1.add("A");
		myTreeSet1.add("B");
		myTreeSet1.add("E");
		myTreeSet1.add("F");
		myTreeSet1.add("D");
		for (String element : myTreeSet1) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("*******************************************************");
		TreeSet<String> myTreeSet2 = new TreeSet<String>(new MyCustomComparator2().reversed());
		myTreeSet2.add("C");
		myTreeSet2.add("A");
		myTreeSet2.add("B");
		myTreeSet2.add("E");
		myTreeSet2.add("F");
		myTreeSet2.add("D");
		for (String element : myTreeSet2) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("*******************************************************");
		// using lambda expression
		TreeSet<String> myTreeSet3 = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));
		myTreeSet3.add("C");
		myTreeSet3.add("A");
		myTreeSet3.add("B");
		myTreeSet3.add("E");
		myTreeSet3.add("F");
		myTreeSet3.add("D");
		for (String element : myTreeSet3) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("*******************************************************");
	}

}

// 1st way - to sort in the reverse order
class MyCustomComparator1 implements Comparator<String> {

	@Override
	public int compare(String aStr, String bStr) {
		return bStr.compareTo(aStr);
	}

}

// 2nd way - to sort in the reverse order
class MyCustomComparator2 implements Comparator<String> {

	@Override
	public int compare(String aStr, String bStr) {
		return aStr.compareTo(bStr);
	}

}
