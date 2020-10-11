/*Method Call By Value and Method Call By Reference*/
package com.javaconcepts.miscellaneous;

public class CallByValueAndCallByReference {

	public static void main(String[] args) {

		double height = 5.2;
		double width = 3.2;

		// Call By Value
		Wall roomWall = new Wall();
		System.out.println("For call by value, before method call, height: " + height + ", width: " + width);
		roomWall.dim(height, width);
		System.out.println("For call by value, after method call, height: " + height + ", width: " + width);
		System.out.println("**************************************************************");

		// Call By Reference
		Wall kitchenWall = new Wall(height, width);
		System.out.println("For call by reference, before method call, height: " + kitchenWall.height + ", width: "
				+ kitchenWall.width);
		roomWall.dim(kitchenWall);
		System.out.println("For call by reference, before method call, height: " + kitchenWall.height + ", width: "
				+ kitchenWall.width);
		System.out.println("**************************************************************");
	}

}

class Wall {
	double height;
	double width;

	public Wall() {

	}

	public Wall(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public void dim(double height, double width) {
		height *= 2;
		width *= 2;
	}

	public void dim(Wall wall) {
		wall.height *= 2;
		wall.width *= 2;
	}
}
