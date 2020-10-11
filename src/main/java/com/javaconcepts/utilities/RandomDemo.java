package com.javaconcepts.utilities;

import java.util.Random;

public class RandomDemo {
	/*
	 * The "Random" class is a generator of pseudorandom numbers which are simply
	 * uniformly distributed sequences. The two constructors are Random() and
	 * Random(long seed) where the first version creates a number generator that
	 * uses a reasonably unique see whereas the second version allows us to specify
	 * a seed value manually. A seed value defines the starting point of the random
	 * sequence. Same seed value for two Random objects will generate the same
	 * random sequence.
	 */
	public static void main(String[] args) {
		Random random1 = new Random();
		Random random2 = new Random(5);
		Random random3 = new Random(5);

		double val, sum = 0;
		int[] bell = new int[10];

		for (int i = 0; i < 100; i++) {
			val = random1.nextGaussian();
			sum += val;
			double t = -2;

			for (int x = 0; x < 10; x++, t += 0.5) {
				if (val < t) {
					bell[x]++;
					break;
				}
			}
		}
		System.out.println("Average of values: " + (sum / 100));

		// display the bell curve sideways
		for (int i = 0; i < 10; i++) {
			for (int x = bell[i]; x > 0; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*************************************************************");

		// Other methods -> nextInt, nextDouble, nextLong, nextFloat, nextBytes,
		// nextBoolean
		// Streams -> double(), ints(), longs()
		// the below will produce same result everytime it runs since they have the same
		// seed value i.e. 5
		System.out.println(random2.nextDouble());
		System.out.println(random3.nextDouble());
		System.out.println("*************************************************************");
	}

}
