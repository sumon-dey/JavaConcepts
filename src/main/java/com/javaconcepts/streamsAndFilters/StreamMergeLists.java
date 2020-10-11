package com.javaconcepts.streamsAndFilters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMergeLists {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<>();
		names1.add("Azbhishek");
		names1.add("Shama");
		names1.add("Richard");
		names1.add("Akansha");
		names1.add("Ashish");

		List<String> names2 = new ArrayList<>();
		names2.add("Abhijeet");
		names2.add("Don");
		names2.add("Alekhya");
		names2.add("Adam");
		names2.add("Rama");

		// Merge two lists and display the merged list in a sorted order
		Stream<String> combinedStream1 = Stream.concat(names1.stream(), names2.stream());
		combinedStream1.sorted().forEach(name -> System.out.println(name));
		System.out.println("********************************************");

		// Match
		System.out.println(names1.stream().anyMatch(name -> name.equalsIgnoreCase("Richard")));
		System.out.println("********************************************");
		Stream<String> combinedStream2 = Stream.concat(names1.stream(), names2.stream());
		System.out.println(combinedStream2.anyMatch(name -> name.equalsIgnoreCase("Don")));
		System.out.println("********************************************");

	}

}
