/*Since Java8, interfaces can have non-abstract implemented methods with method signature preceded by the 
 * "default" keyword*/
/*This is to make addition of methods in interface flexible without breaking the existing implementing classes as well
 * as to add methods which can be optional for some implementing classes*/
package com.javaconcepts.interfaces;

public class DefaultMethodInterface {

	public static void main(String[] args) {
		Activity activity;
		activity = new Football();
		activity.running();
		activity.jumping();
		activity.meditation();
		System.out.println("********************************************");
		activity = new TableTennis();
		activity.running();
		activity.jumping();
		activity.meditation();
		System.out.println("********************************************");
	}

}

// Interface with a Default method
interface Activity {
	void running();

	void jumping();

	default void meditation() {
		System.out.println("Default meditation");
	}
}

// class that does not implement the "meditation" method
class Football implements Activity {

	@Override
	public void running() {
		System.out.println("Football -> Practice running for 30 minutes");
	}

	@Override
	public void jumping() {
		System.out.println("Football -> Practice running for 15 minutes");
	}

}

// class that implements the "meditation" method according to its requirement
class TableTennis implements Activity {

	@Override
	public void running() {
		System.out.println("Table Tennis -> Practice running for 10 minutes");
	}

	@Override
	public void jumping() {
		System.out.println("Table Tennis -> Practice jumping for 20 minutes");
	}

	@Override
	public void meditation() {
		System.out.println("Table Tennis -> Practice meditation for 25 minutes");
	}

}
