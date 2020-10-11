package com.javaconcepts.generics;

public class GenericsMethodDemo {

	public static void main(String[] args) {

		Integer[] nums = { 1, 2, 3, 4, 5 };
		String[] strs = { "One", "Two", "Three", "Four", "Five" };
		if (isIn(3, nums)) {
			System.out.println("3 is in nums");
		}
		if (!isIn(8, nums)) {
			System.out.println("8 is not in nums");
		}
		if (isIn("Two", strs)) {
			System.out.println("two is in strs");
		}
		if (!isIn("Eight", strs)) {
			System.out.println("eight is not in strs");
		}
		// The below will not compile
		/*
		 * if (!isIn("eight", nums)) { System.out.println("eight is not in strs"); }
		 */
	}

	public static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length; i++) {
			if (x.equals(y[i])) {
				return true;
			}
		}
		return false;
	}

}
