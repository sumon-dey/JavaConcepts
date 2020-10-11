/*Basics of Inheritance - Superclass and Subclass*/
package com.javaconcepts.inheritance;

public class InheritanceBasics {

	public static void main(String[] args) {
		CollegeStudent collegeStudent1 = new CollegeStudent();
		collegeStudent1.displayCollegeInfoFromSuperclass();
		System.out.println("******************************************************");
		ScienceStudent scienceStudent1 = new ScienceStudent();
		scienceStudent1.displayCollegeInfoFromSuperclass();
		scienceStudent1.displayCollegeInfoFromSubclass();
		System.out.println("******************************************************");
		CollegeStudent collegeStudent2 = new ScienceStudent();
		// collegeStudent2.displayCollegeInfoFromSubclass(); -> This will throw
		// compile error since the reference variable with superclass data type
		// cannot access the individual method of the subclass object
		System.out.println("******************************************************");
		// ScienceStudent scienceStudent2 = new CollegeStudent();
		// -> This will throw compile error since reference variable with
		// subclass data type cannot point to the superclass object
		System.out.println("******************************************************");
	}

}

// Superclass
class CollegeStudent {
	private int secretCollegeId = 12345;
	public int registrationNumber = 5463;
	public String collegeName = "Riverdale Institute of Technology";

	public void displayCollegeInfoFromSuperclass() {
		System.out.println("College Name is: " + collegeName);
		System.out.println("Secret College Id is: " + secretCollegeId);
		System.out.println("Registration Number is: " + registrationNumber);
	}

}

// Subclass
class ScienceStudent extends CollegeStudent {

	private boolean isMathStudent;

	public void displayCollegeInfoFromSubclass() {
		System.out.println("College Name is: " + collegeName);
		System.out.println("Registration Number is: " + registrationNumber);
		System.out.println("Student is a Math student: " + isMathStudent);
		// System.out.println("Secret College Id is: " + secretCollegeId); ->
		// This will throw compile error since "secretCollegeId" is a private
		// memebr of the superclass
	}

}
