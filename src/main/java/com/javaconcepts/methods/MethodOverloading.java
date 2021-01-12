/*Method Overloading*/
package com.javaconcepts.methods;

public class MethodOverloading {
	/*
	 * Classes having multiple methods with the same name, but having different
	 * types or/and number of parameters, will feature the concept of
	 * "Method Overloading". If two or more methods are having no parameter or
	 * parameter/parameters of same data type, in the same sequence, then
	 * compilation error will be thrown by the Java Compiler.
	 */
	private static double minimumDistanceToWalk = 2.3;

	public static void main(String[] args) {
		System.out.println("Today you need to walk for " + morningWalk() + " km");
		// Type promotion
		System.out.println("Today you need to walk for " + morningWalk(4) + " km");
		morningWalk(5.2, 2.1, true);
		morningWalk(3.2, 1.1, false);

	}

	private static double morningWalk() {
		return minimumDistanceToWalk;
	}

	private static double morningWalk(double moreDistance) {
		return minimumDistanceToWalk + moreDistance;
	}

	private static void morningWalk(double moreDistance, double jogDistance, boolean toJog) {
		if (toJog) {
			System.out.println("Today you need to walk for a total of " + (minimumDistanceToWalk + moreDistance)
					+ " km, out of which you need to jog for " + jogDistance + " km");
		} else {
			System.out.println("Today you need to walk for a total of " + (minimumDistanceToWalk + moreDistance)
					+ " km, but no need to jog.");
		}

	}

}
