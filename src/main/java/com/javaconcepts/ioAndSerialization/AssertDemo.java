package com.javaconcepts.ioAndSerialization;

public class AssertDemo {

	public static int val = 5;

	public static int getNum() {
		return val--;
	}

	// run with -ea in the VM Arguments
	public static void main(String[] args) {
		int n;
		for (int i = 1; i <= 10; i++) {
			n = getNum();
			assert n > 0 : "n is not positive!";
		}

	}

}
