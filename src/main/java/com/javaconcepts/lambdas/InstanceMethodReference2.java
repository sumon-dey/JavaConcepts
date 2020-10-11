package com.javaconcepts.lambdas;

public class InstanceMethodReference2 {

	public static void main(String[] args) {
		int count;

		// create an array of HighTemp objects
		HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82), new HighTemp(90), new HighTemp(89),
				new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83) };

		// use counter() with arrays of the class HighTemp.
		// notice that a reference to the instance method sameTemp() is passed as the
		// second argument
		count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
		System.out.println(count + " days had a high of 89");

		// now create and use another array of HighTemp objects
		HighTemp[] weekDayHighs2 = { new HighTemp(32), new HighTemp(12), new HighTemp(24), new HighTemp(19),
				new HighTemp(18), new HighTemp(12), new HighTemp(-1), new HighTemp(13) };

		count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
		System.out.println(count + " days had a high of 12");

		// now use lessThanTemp() to find days when temperature was less than a
		// specified value
		count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
		System.out.println(count + " days had a high less than 89");
		count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
		System.out.println(count + " days had a high of less than 19");
	}

	// a method that returns the number of occurrences of an object for which some
	// criteria, as specified by the MyFunc1 parameter, is true
	static <T> int counter(T[] vals, MyFunc1<T> f, T v) {
		int count = 0;
		for (int i = 0; i < vals.length; i++) {
			if (f.func(vals[i], v)) {
				count++;
			}
		}
		return count;
	}

}

// a class that stores the temperature high for a day
class HighTemp {
	private int hTemp;

	HighTemp(int ht) {
		hTemp = ht;
	}

	// return true if the invoking HighTemp object has the same temperature as ht2
	boolean sameTemp(HighTemp ht2) {
		return hTemp == ht2.hTemp;
	}

	// return true if the invoking HighTemp object has a temperature that is less
	// than ht2
	boolean lessThanTemp(HighTemp ht2) {
		return hTemp < ht2.hTemp;
	}
}

// a functional interface that takes two reference arguments
// and returns a boolean result
interface MyFunc1<T> {
	boolean func(T v1, T v2);
}