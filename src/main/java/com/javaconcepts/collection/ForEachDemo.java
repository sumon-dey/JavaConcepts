package com.javaconcepts.collection;

import java.util.ArrayList;

public class ForEachDemo {
	/*
	 * If we don't want to modify the elements of a collection while iterating over
	 * it or if we don't want to move backwards through the collection, then it is
	 * simple and convenient to use the "forEach" loop ("Enhanced for loop") rather
	 * than using Iterator, ListIterator or SplitIterator
	 */
	public static void main(String[] args) {
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(5);
		System.out.print("Original contents of myArrayList: ");
		for (int val : myArrayList) {
			System.out.print(val + " ");
		}
		System.out.println();
		// finding the sum of all the elements using forEach loop
		int sum = 0;
		for (int val : myArrayList) {
			sum += val;
		}
		System.out.println("The sum of all the elements in myArrayList is: " + sum);
	}

}
