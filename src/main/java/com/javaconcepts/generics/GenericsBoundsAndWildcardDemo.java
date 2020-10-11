package com.javaconcepts.generics;

public class GenericsBoundsAndWildcardDemo {

	public static void main(String[] args) {
		// Integer is a subclass of "Number"
		Integer[] iNums = { 1, 2, 3, 4, 5 };
		Stats<Integer> iOb = new Stats<Integer>(iNums);
		System.out.println("Average is: " + iOb.average());

		// Double is also a subclass of "Number"
		Double[] iDums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dOb = new Stats<Double>(iDums);
		System.out.println("Average is: " + dOb.average());

		// Float is also a subclass of "Number"
		Float[] iFums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Stats<Float> fOb = new Stats<Float>(iFums);
		System.out.println("Average is: " + fOb.average());

		// String is not a subclass of "Number" hence the below will throw Compile Error
		// String[] iSums = { "1", "2", "3", "4", "5" };
		// Stats<String> sOb = new Stats<String>(iSums);
		// System.out.println("Average is: " + sOb.average());

		System.out.println("*******************************************************");

		System.out.print("Averages of iOb and dOb ");
		if (iOb.sameAverage(dOb)) {
			System.out.println("are the same");
		} else {
			System.out.println("differ");
		}

		System.out.print("Averages of iOb and fOb ");
		if (iOb.sameAverage(fOb)) {
			System.out.println("are the same");
		} else {
			System.out.println("differ");
		}

	}

}

class Stats<T extends Number> {
	T[] ob;

	public Stats(T[] ob) {
		this.ob = ob;
	}

	// return average value (in double) for all the cases
	public double average() {
		double sum = 0;
		for (int i = 0; i < ob.length; i++) {
			sum += ob[i].doubleValue();
		}
		return sum / ob.length;
	}

	// check whether average is same or not
	public boolean sameAverage(Stats<?> ob) {
		if (this.average() == ob.average()) {
			return true;
		}
		return false;
	}
}
