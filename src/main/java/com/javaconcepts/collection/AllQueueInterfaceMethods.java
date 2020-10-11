package com.javaconcepts.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;

public class AllQueueInterfaceMethods {

	public static void main(String[] args) {
		Queue<String> citiesInIndia = new PriorityQueue<>();
		Queue<String> citiesInAustralia = new LinkedList<>();
		Queue<String> citiesInUS = new LinkedList<>();

		citiesInAustralia.add("Sydney");
		citiesInAustralia.add("Melbourne");
		citiesInAustralia.add("Perth");
		citiesInAustralia.add("Adelaide");
		citiesInAustralia.add("Brisbane");

		citiesInIndia.add("Pune");
		citiesInIndia.add("Mumbai");

		citiesInUS.add("New York");
		citiesInUS.add("New Jersey");

		/* Methods inherited from the Collection interface */
		// add
		citiesInIndia.add("Kolkata");
		System.out.println(citiesInIndia.toString());
		// addAll
		citiesInIndia.addAll(citiesInAustralia);
		citiesInIndia.addAll(citiesInUS);
		System.out.println(citiesInIndia.toString());
		// remove
		citiesInIndia.remove(1);
		System.out.println(citiesInIndia.toString());
		// removeAll
		citiesInIndia.removeAll(citiesInUS);
		System.out.println(citiesInIndia.toString());
		// retainAll
		citiesInIndia.retainAll(citiesInAustralia);
		System.out.println(citiesInIndia.toString());
		// clear
		citiesInIndia.clear();
		System.out.println(citiesInIndia.toString());
		// isEmpty
		System.out.println(citiesInIndia.isEmpty());
		// contains
		citiesInIndia.add("Pune");
		citiesInIndia.add("Mumbai");
		System.out.println(citiesInIndia.contains("Pune"));
		// containsAll
		System.out.println(citiesInIndia.containsAll(citiesInIndia));
		// equals
		System.out.println(citiesInIndia.equals(citiesInIndia));
		System.out.println(citiesInIndia.equals(citiesInUS));
		// size
		System.out.println(citiesInAustralia.size());
		// iterator
		Iterator<String> itr = citiesInAustralia.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// splititerator
		Spliterator<String> splitItr = citiesInAustralia.spliterator();
		splitItr.forEachRemaining(System.out::println);
		// hashCode
		System.out.println(citiesInAustralia.hashCode());
		// stream
		System.out.println(citiesInAustralia.stream());
		// parallelStream
		System.out.println(citiesInAustralia.parallelStream());
		// toArray
		Object[] indianCities = citiesInIndia.toArray();
		System.out.println(Arrays.toString(indianCities));

		System.out.println("****************************************************");

		/* Concrete methods of the Queue interface */
		// element() -> returns element at the head of the queue
		System.out.println(citiesInIndia.element());
		// offer() -> attempts to add obj to the queue
		System.out.println("Is object added?: " + citiesInIndia.offer("Mumbai"));
		System.out.println("Is object added?: " + citiesInIndia.offer("Chennai"));
		// peek() -> returns the element at the head of the queue without removing the
		// element
		System.out.println(citiesInIndia.peek());
		System.out.println(citiesInIndia);
		// poll() -> returns the element at the head of the queue and also removes the
		// element
		System.out.println(citiesInIndia.poll());
		System.out.println(citiesInIndia);
		// remove() -> removes the element at the head of the queue
		System.out.println(citiesInIndia.remove());
		System.out.println(citiesInIndia);
		System.out.println("****************************************************");
	}

}
