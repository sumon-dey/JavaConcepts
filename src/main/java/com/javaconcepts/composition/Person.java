/*Composition*/
package com.javaconcepts.composition;

/*Composition is a design technique to implement HAS-A relationship in Java classes.
 * It allows us to model objects that are made up of other objects. The object which is present in
 * another object gets destroyed too when the other object gets destroyed.*/
public class Person {
	private String name;
	private Job job;
	private Family family;

	public static void main(String[] args) {
		Job samsJob = new Job(34562, "Seattle", 12);
		Job johnsJob = new Job(63203.2, "Chicago", 10);
		Family samsFamily = new Family(4, "Richard", 1);
		Family johnsFamily = new Family(7, "Tom", 4);
		Person sam = new Person("Sam", samsJob, samsFamily);
		Person john = new Person("John", johnsJob, johnsFamily);
		sam.fetchJobDetails();
		System.out.println("*****************************************************************************");
		sam.fetchFamilyDetails();
		System.out.println("*****************************************************************************");
		john.fetchJobDetails();
		System.out.println("*****************************************************************************");
		john.fetchFamilyDetails();
		System.out.println("*****************************************************************************");
	}

	public Person(String name, Job job, Family family) {
		this.name = name;
		this.job = job;
		this.family = family;
	}

	public void fetchJobDetails() {
		System.out.println(this.name + "\'s office is located at " + this.job.getOfficeLocation());
		System.out.println(this.name + "\'s salary is " + this.job.getSalary());
		System.out.println("The number of leaves " + this.name + " can avail is " + this.job.getLeavesInDays());
	}

	public void fetchFamilyDetails() {
		System.out.println(this.name + " has " + this.family.getNumberOfFamilyMembers() + " family members in total.");
		System.out.println(this.name + "\'s father's name is " + this.family.getFatherName());
		System.out.println(this.name + " is having " + this.family.getSiblings() + " sibling(s).");
	}

}
