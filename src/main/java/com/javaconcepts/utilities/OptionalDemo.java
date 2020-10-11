package com.javaconcepts.utilities;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalDemo {
	/*
	 * The "Optional", "OptionalDouble", "OptionalInt" and "OptionalLong" classes
	 * offer a way to handle situations in which a value may or may not be present.
	 * These classes are useful in cases where you would want to avoid
	 * NullPointerException.
	 */
	public static void main(String[] args) {
		// Optional
		Optional<String> noVal = Optional.empty();
		Optional<String> hasVal = Optional.of("ABCDEFG");
		if (noVal.isPresent()) {
			System.out.println("This won't be displayed.");
		} else {
			System.out.println("noVal has no value.");
		}
		if (hasVal.isPresent()) {
			System.out.println("The string in hasVal is: " + hasVal.get());
		}
		String defStr = noVal.orElse("Default String");
		System.out.println(defStr);
		System.out.println("************************************************************");

		// OptionalInt
		OptionalInt intVal = OptionalInt.of(5463);
		if (intVal.isPresent()) {
			System.out.println("The int in intVal is: " + intVal.getAsInt());
		}
		System.out.println("************************************************************");

		// OptionalDouble
		OptionalDouble doubleVal = OptionalDouble.of(5463.23);
		if (doubleVal.isPresent()) {
			System.out.println("The double in doubleVal is: " + doubleVal.getAsDouble());
		}
		System.out.println("************************************************************");

		// OptionalLong
		OptionalLong longVal = OptionalLong.of(546334543534L);
		if (longVal.isPresent()) {
			System.out.println("The long in longVal is: " + longVal.getAsLong());
		}
		System.out.println("************************************************************");
	}

}
