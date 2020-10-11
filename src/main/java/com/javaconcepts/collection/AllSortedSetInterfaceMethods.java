package com.javaconcepts.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class AllSortedSetInterfaceMethods {

	public static void main(String[] args) {
		SortedSet<String> mySortedSet = new TreeSet<>();
		/*
		 * Concrete methods of the SortedSet interface (in addition to all the methods
		 * of the Set interface since SortedSet interface extends the Set interface)
		 */
		// add
		mySortedSet.add("Say");
		mySortedSet.add("Hello");
		mySortedSet.add("To");
		mySortedSet.add("The");
		mySortedSet.add("New");
		mySortedSet.add("Java");
		mySortedSet.add("Programmers");
		System.out.println(mySortedSet.toString());
		// first
		System.out.println(mySortedSet.first());
		// last
		System.out.println(mySortedSet.last());
		// headSet
		SortedSet<String> mySubSortedSet = mySortedSet.headSet("Programmers");
		System.out.println(mySubSortedSet);
		// subSet
		SortedSet<String> mySubSortedSetBetweenJavaAndSay = mySortedSet.subSet("Java", "Say");
		System.out.println(mySubSortedSetBetweenJavaAndSay);
		// tailSet
		SortedSet<String> myAfterSortedSet = mySortedSet.tailSet("New");
		System.out.println(myAfterSortedSet);
	}

}
