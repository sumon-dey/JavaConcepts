package com.javaconcepts.utilities;

import java.util.BitSet;

public class BitSetDemo {
	/*
	 * A "BitSet" class creates a special type of array that holds bit values in the
	 * form of boolean values, This array can increase in size as needed. All bits
	 * are initializes to false.
	 */
	public static void main(String[] args) {
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);
		for (int i = 0; i < 16; i++) {
			if (i % 2 == 0) {
				bits1.set(i);
			}
			if (i % 5 != 0) {
				bits2.set(i);
			}
		}
		System.out.println("Initial Pattern in bits1:");
		System.out.println(bits1);
		System.out.println("\nInitial Pattern in bits2:");
		System.out.println(bits2);

		// AND bits
		bits2.and(bits1);
		System.out.println("\nbits2 AND bits1:");
		System.out.println(bits2);

		// OR bits
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1:");
		System.out.println(bits2);

		// XOR bits
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1:");
		System.out.println(bits2);
	}

}
