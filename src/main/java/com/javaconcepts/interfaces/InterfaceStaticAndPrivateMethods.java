/*Static and Private Interface methods*/
package com.javaconcepts.interfaces;

public class InterfaceStaticAndPrivateMethods {

	public static void main(String[] args) {
		SportActivity sportActivity;
		// Static Interface Method call
		SportActivity.running();
		System.out.println("*********************************************");
		// Private Interface Method call
		sportActivity = new Cricket();
		sportActivity.checking1();
		sportActivity.checking2();
		System.out.println("*********************************************");
	}

}

interface SportActivity {
	// Static Interface Method
	static void running() {
		System.out.println("Inside SportActivity Interface -> Practice running");
	}

	// Private Interface method (can be called from other private interface
	// methods/ default methods)
	private String checking() {
		return "Inside SportActivity Interface -> Practice checking";
	}

	default void checking1() {
		System.out.println("Inside checking1 -> " + checking());
	}

	default void checking2() {
		System.out.println("Inside checking2 -> " + checking());
	}

}

class Cricket implements SportActivity {

}
