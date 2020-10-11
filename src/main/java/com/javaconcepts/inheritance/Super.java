/*"Super" can be of two forms - the first one for the superclass' constructor and the second one to 
 * access the superclass' members (fields and methods)*/
package com.javaconcepts.inheritance;

public class Super {

	public static void main(String[] args) {
		// "super" for constructor
		Corporation theMunicipalCorporation = new Corporation();
		System.out.println("************************************************");
		// "super" to access members
		theMunicipalCorporation.cleanliness();
		System.out.println("************************************************");
		theMunicipalCorporation.displayName();
		System.out.println("************************************************");
	}

}

class Country {
	public String name;

	public Country() {
		this.name = "India";
		System.out.println("Inside the constructor of the Country class");
	}

}

class City extends Country {
	public String name = "Bangalore";

	public City() {
		super();
		System.out.println("Inside the constructor of the City class");
	}

	public void cleanliness() {
		System.out.println("City is clean.");
	}
}

class Corporation extends City {
	public String name = "Hulimavu";

	public Corporation() {
		super();
		System.out.println("Inside the constructor of the Corporation class");
	}

	public void cleanliness() {
		super.cleanliness();
		System.out.println("Corporation is clean.");
	}

	public void displayName() {
		System.out.println("Corporation name is: " + name + ", in: " + super.name);
	}
}
