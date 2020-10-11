package com.javaconcepts.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*Deque interface extends the Queue interface and hence inherits the methods of the Queue interface*/
public class AllDequeInterfaceMethods {

	public static void main(String[] args) {
		/* Implementing classes are ArrayDeque and LinkedList */
		Deque<String> citiesInIndia = new ArrayDeque<>();
		Deque<String> citiesInAustralia = new LinkedList<>();
		Deque<String> citiesInUS = new LinkedList<>();

		citiesInAustralia.add("Sydney");
		citiesInAustralia.add("Melbourne");
		citiesInAustralia.add("Perth");
		citiesInAustralia.add("Adelaide");
		citiesInAustralia.add("Brisbane");

		citiesInIndia.add("Pune");
		citiesInIndia.add("Mumbai");

		citiesInUS.add("New York");
		citiesInUS.add("New Jersey");

		/* Concrete methods of the Deque Interface */
		// addFirst() -> adds object to the head of the Deque
		System.out.println(citiesInIndia);
		citiesInIndia.addFirst("Bengaluru");
		System.out.println(citiesInIndia);
		// addLast() -> adds object to the tail of the Deque
		citiesInIndia.addLast("Nashik");
		System.out.println(citiesInIndia);
		// descendingIterator() -> iterates from tail to head
		Iterator<String> descItr = citiesInIndia.descendingIterator();
		while (descItr.hasNext()) {
			System.out.println(descItr.next());
		}
		// getFirst() -> returns the first element in the Deque
		System.out.println("First element in the Deque: " + citiesInIndia.getFirst());
		// getLast() -> returns the last element in the Deque
		System.out.println("Last element in the Deque: " + citiesInIndia.getLast());
		// offerFirst() -> Attempts to add object to the head of the Deque
		System.out.println(citiesInIndia.offerFirst("Dehradun"));
		System.out.println("After offerFirst(): " + citiesInIndia);
		// offerLast() -> Attempts to add object to the tail of the Deque
		System.out.println(citiesInIndia.offerLast("Guwahati"));
		System.out.println("After offerLast(): " + citiesInIndia);
		// peekFirst() -> returns the element at the head of the Deque (without removing
		// it)
		System.out.println(citiesInIndia.peekFirst());
		// peekLast() -> returns the element at the tail of the Deque (without removing
		// it)
		System.out.println(citiesInIndia.peekLast());
		// pollFirst() -> returns the element at the head of the Deque (removing it)
		System.out.println(citiesInIndia.pollFirst());
		System.out.println(citiesInIndia);
		// pollLast() -> returns the element at the tail of the Deque (removing it)
		System.out.println(citiesInIndia.pollLast());
		System.out.println(citiesInIndia);
		// pop() -> Returns and removes the element at the head of the Deque
		System.out.println("Before pop(): " + citiesInIndia);
		System.out.println("City removed after using pop(): " + citiesInIndia.pop());
		System.out.println("After pop(): " + citiesInIndia);
		// push() -> Adds object to the head of the Deque
		System.out.println("Before push(): " + citiesInIndia);
		citiesInIndia.push("Bengaluru");
		System.out.println("After push(): " + citiesInIndia);
		// removeFirst() -> Returns and removes the element from the head of the Deque
		System.out.println(citiesInIndia.removeFirst());
		System.out.println("After removeFirst(): " + citiesInIndia);
		// removeFirstOccurence() -> removed the first occurence of the element from the
		// Deque
		citiesInIndia.add("Mumbai");
		System.out.println(citiesInIndia.removeFirstOccurrence("Mumbai"));
		System.out.println("After removing the first occurence of Mumbai: " + citiesInIndia);
		// removeLast() -> Returns and removes the element from the tail of the Deque
		System.out.println(citiesInIndia.removeLast());
		System.out.println("After removeLast(): " + citiesInIndia);
		// removeLastOccurence() -> removed the last occurence of the element from the
		// Deque
		citiesInIndia.add("Pune");
		System.out.println(citiesInIndia.removeLastOccurrence("Pune"));
		System.out.println("After removing the last occurence of Pune: " + citiesInIndia);
	}
}
