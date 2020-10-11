package com.javaconcepts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIteratorDemo {
	/*
	 * The "iterator" object helps us to traverse/modify through the elements of a
	 * collection one by one. The "listIterator" object helps us to traverse/modify
	 * both forward and backward through the elements of a collection one by one
	 */
	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Cricket");
		myArrayList.add("Football");
		myArrayList.add("Hockey");
		myArrayList.add("Tennis");
		myArrayList.add("Badminton");
		System.out.print("Original contents of myArrayList: ");
		// Iterator
		Iterator<String> itr = myArrayList.iterator();
		// use iterator to display all contents
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		// ListIterator (This will only work in collections which implement the List
		// interface)
		ListIterator<String> listItr = myArrayList.listIterator();
		// modify objects being iterated
		while (listItr.hasNext()) {
			String element = listItr.next();
			listItr.set(element + "+");
		}
		System.out.print("Modified contents of myArrayList: ");
		// use iterator again to display all contents
		itr = myArrayList.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		// use listIterator to display the contents in reverse
		System.out.print("Modified list backwards: ");
		while (listItr.hasPrevious()) {
			String element = listItr.previous();
			System.out.print(element + " ");
		}
	}

}
