/*Objects and Instance Members (Instance Variables and Instance Methods)*/
package com.javaconcepts.classesAndObjects;

public class ObjectsAndInstanceMembers {
	public static void main(String[] args) {
		Box myGiftBox1 = new Box();
		myGiftBox1.width = 5;
		myGiftBox1.height = 4;
		myGiftBox1.depth = 3;
		System.out.println("Volume of my first gift box is: " + myGiftBox1.boxVolume());
		System.out.println("**************************************************************");
		Box myGiftBox2 = new Box();
		myGiftBox2.width = 4;
		myGiftBox2.height = 3;
		myGiftBox2.depth = 2;
		System.out.println("Volume of my second gift box is: " + myGiftBox2.boxVolume());
		System.out.println("**************************************************************");
	}
}

class Box {
	public double width;
	public double height;
	public double depth;

	public double boxVolume() {
		return (width * height * depth);
	}
}
