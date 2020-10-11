package com.javaconcepts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

public class AllSetInterfaceMethods {

	public static void main(String[] args) {
		// 1st set
		Set<String> citiesInAustralia = new HashSet<>();
		citiesInAustralia.add("Sydney");
		citiesInAustralia.add("Melbourne");
		citiesInAustralia.add("Perth");
		citiesInAustralia.add("Adelaide");
		citiesInAustralia.add("Brisbane");
		// 2nd set
		Set<String> citiesInIndia = new HashSet<>();
		citiesInIndia.add("Pune");
		citiesInIndia.add("Mumbai");
		// 3rd set
		Set<String> citiesInUS = new HashSet<>();
		citiesInUS.add("New York");
		citiesInUS.add("New Jersey");

		/*
		 * Methods inherited from the Collection interface (Set does not have its own
		 * concrete methods)
		 */
		// add
		citiesInIndia.add("Kolkata");
		System.out.println(citiesInIndia.toString());
		System.out.println("Duplicate elements not allowed, hence: "+citiesInIndia.add("Pune"));
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
	}

}
