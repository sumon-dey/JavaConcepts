/*Inheritance*/
package com.javaconcepts.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal genericAnimal = new Animal("SpeciesX", 1, 1, 30);
		genericAnimal.eat();
		genericAnimal.move();
		System.out.println("*****************************************************************");

		Cat homeCat = new Cat("Suzy", 23, 2, 4, 1, 15);
		homeCat.eat();
		homeCat.move();
		homeCat.run();
		System.out.println("*****************************************************************");

		Fish angelFish = new Fish("Angel", 2, 1, 2, 4);
		angelFish.eat();
		angelFish.move();
		angelFish.swim();
		System.out.println("*****************************************************************");
	}

}
