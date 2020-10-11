package com.javaconcepts.lambdas;

import java.util.function.Function;

/*Following are the pre-defined Functioal Interfaces present in the java.util.function package
 * UnaryOperator<T>
 * BinaryOperator<T>
 * Consumer<T>
 * Supplier<T>
 * Function<T,R>
 * Predicate<T>*/
public class PredefinedFunctionalInterface {

	public static void main(String[] args) {
		// this block lambda computes the factorial of an int value
		// here, the functional interface is the "Function"
		Function<Integer, Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};
		System.out.println("The factorial of 3 is: " + factorial.apply(3));
		System.out.println("The factorial of 5 is: " + factorial.apply(5));
	}

}
