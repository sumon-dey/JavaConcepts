/*Interfaces can be present  inside a class as members. Such interfaces are known as 
 * "Nested Interfaces" or "Member Interfaces"*/
/*Interfaces can also have variables which the implementing classes can use as constants*/
package com.javaconcepts.interfaces;

public class NestedInterfaceTest {

	public static void main(String[] args) {
		Athletics.Training training = new Soccer();
		training.running();
		System.out.println("*********************************************");
		training.jumping();
		System.out.println("*********************************************");
	}

}

// The class containing the Nested Interface as its member
class Athletics {
	// Nested Interface
	public interface Training {
		// Below are two Interface variables which behave as global constants
		String TRAINING = "YES";
		boolean ISABSENT = false;

		void running();

		void jumping();
	}
}

// Calling the Nested Interface
class Soccer implements Athletics.Training {
	@Override
	public void running() {
		System.out.println("Practice running for 30 minutes everyday.");
		System.out.println("TRAINING: " + TRAINING);
	}

	@Override
	public void jumping() {
		System.out.println("Practice jumping for 15 minutes everyday.");
		System.out.println("Is Absent?: " + ISABSENT);
	}
}
