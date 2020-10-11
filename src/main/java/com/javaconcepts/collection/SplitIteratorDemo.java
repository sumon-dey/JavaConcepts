package com.javaconcepts.collection;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorDemo {
	/*
	 * The "splitIterator" method is defined by the "SplitIterator" interface and it
	 * cycles through a sequence of elements like iterator and listIterator.
	 * "spliIterator" has the ability to provide support for parallel iteration of
	 * portions of the sequence and hence it supports "Parallel Programming". Also,
	 * "splitIterator" offers a streamlined approach that combines the "hasNext" and
	 * "next" operations into one method.
	 */
	public static void main(String[] args) {
		// create an ArrayList for doubles
		ArrayList<Double> myArrayList = new ArrayList<Double>();
		// add values to the ArrayList
		myArrayList.add(1.0);
		myArrayList.add(2.0);
		myArrayList.add(3.0);
		myArrayList.add(4.0);
		myArrayList.add(5.0);

		// use tryAdvance() to display the contents for the ArrayList
		System.out.println("Contents of myArrayList: ");
		Spliterator<Double> splitItr = myArrayList.spliterator();
		while (splitItr.tryAdvance((n) -> System.out.println(n)))
			;
		System.out.println("**********************************************************");

		// create new list that contains square roots
		splitItr = myArrayList.spliterator();
		ArrayList<Double> sqrs = new ArrayList<Double>();
		while (splitItr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))))
			;
		// use forEachRemaining() to display the contents of sqrs
		System.out.println("Contents of sqrs: ");
		splitItr = sqrs.spliterator();
		splitItr.forEachRemaining((n) -> System.out.println(n));
		System.out.println("**********************************************************");
	}

}
