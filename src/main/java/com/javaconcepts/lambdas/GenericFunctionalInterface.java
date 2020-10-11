package com.javaconcepts.lambdas;

public class GenericFunctionalInterface {

	public static void main(String[] args) {

		// Factorial using Generic Functional Interface
		CommonInterface<Integer> numericFunc = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};
		System.out.println("Factorial of 3 is: " + numericFunc.func(3));
		System.out.println("Factorial of 5 is: " + numericFunc.func(5));
		System.out.println("*********************************************************");

		// String Reversal using Generic Functional Interface
		CommonInterface<String> stringFunc = (str) -> {
			String reverse = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse += str.charAt(i);
			}
			return reverse;
		};
		System.out.println("The reverse of School is: " + stringFunc.func("School"));
		System.out.println("The reverse of Development is: " + stringFunc.func("Development"));
		System.out.println("*********************************************************");
	}

}

interface CommonInterface<T> {
	public abstract T func(T t);
}
