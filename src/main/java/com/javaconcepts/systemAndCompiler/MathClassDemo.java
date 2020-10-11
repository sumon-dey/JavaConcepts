package com.javaconcepts.systemAndCompiler;

/*The "Math" class contains all the floating-point functions that are used for Geometry and Trigonometry
 * as well as some general purpose methods. The "Math" class defines two double constants:-
 * E (approximately 2.72)*
 * PI (approximately 3.14)*/

public class MathClassDemo {

	public static void main(String[] args) {
		// sine, cosine and tan
		System.out.println("sin: " + Math.sin(2.34));
		System.out.println("cos: " + Math.cos(2.34));
		System.out.println("tan: " + Math.tan(2.34));
		// cuberoot
		System.out.println("cuberoot: " + Math.cbrt(64.0));
		// exponential
		System.out.println("exponential: " + Math.exp(2));
		// logarithm
		System.out.println("logarithm: " + Math.log(2));
		System.out.println("logarithm to base 10: " + Math.log10(2));
		// power
		System.out.println("Raised to the power: " + Math.pow(2.0, 3.0));
		// Square Root
		System.out.println("Square Root: " + Math.sqrt(36.0));
		// absolute value
		System.out.println("abs for int: " + Math.abs(2));
		System.out.println("abs for long: " + Math.abs(3002337L));
		System.out.println("abs for double: " + Math.abs(23.4D));
		System.out.println("abs for float: " + Math.abs(2.44F));
		// ceiling (returns the smallest whole number >= arg)
		System.out.println("ceiling: " + Math.ceil(24.2));
		// floor (returns the largest whole number <= arg)
		System.out.println("floor: " + Math.floor(24.2));
		// max
		System.out.println("max: " + Math.max(24.2, 31));
		// min
		System.out.println("min: " + Math.min(22L, 31.5));
		// round
		System.out.println("round: " + Math.round(4.4747839));

		// Angles -> toRadians() and toDegrees()
		double theta = 120.0;
		System.out.println(theta + " degress is " + Math.toRadians(theta) + " radians.");
		theta = 1.312;
		System.out.println(theta + " radians is " + Math.toDegrees(theta) + " degrees.");
	}

}
