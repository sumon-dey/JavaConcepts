/*Stream class is from the Collection package*/
package com.javaconcepts.streamsAndFilters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		// Count the number of names starting with the alphabet A
		List<String> names = new ArrayList<>();
		names.add("Abhishek");
		names.add("Sam");
		names.add("Richard");
		names.add("Akash");
		names.add("Ashish");

		// Without using streams
		int count = 0;
		for (String name : names) {
			if (name.startsWith("A")) {
				count++;
			}
		}
		System.out.println("The count of names which starts with A is: " + count);
		System.out.println("*****************************************************************");

		// With stream filter
		// Here "filter" method is the intermediate operation which gives a
		// filtered stream and "count" method
		// is the terminal operation.
		long streamCount1 = names.stream().filter((name) -> name.startsWith("A")).count();
		System.out.println("The count of names which starts with A is: " + streamCount1);
		System.out.println("*****************************************************************");

		// Creating a Stream collection using the Stream API
		// Point 1 - There is no life for intermediate operation if there is no
		// terminal operation
		// Point 2 - Terminal operation will execute only if the intermediate
		// operation return "true"
		long streamCount2 = Stream.of("Abhishek", "Sam", "Richard", "Tom", "Ashish").filter((name) -> {
			name.startsWith("A");
			return false;
		}).count();
		System.out.println("The count of names which starts with A is: " + streamCount2);
		System.out.println("*****************************************************************");

		// Print all the names (having letters greater than 3) in the names list
		// using Stream
		names.stream().filter(name -> name.length() > 3).forEach(name -> System.out.println(name));
		System.out.println("*****************************************************************");
		// Print the first name (having letters greater than 3) in the names
		// list
		names.stream().filter(name -> name.length() > 3).limit(1).forEach(name -> System.out.println(name));
		System.out.println("*****************************************************************");
	}

}
