/*Passing objects as method parameters*/
package com.javaconcepts.classesAndObjects;

public class ObjectsAsMethodParameters {

	public static void main(String[] args) {
		Parcel myParcel1 = new Parcel(5.0, 4.2, 3.5);
		Parcel myParcel2 = new Parcel(5.0, 4.2, 3.5);
		Parcel myParcel3 = new Parcel(2, 4.2, 3.5);
		System.out.println("myParcel1 == myParcel2: " + myParcel1.equalTo(myParcel2));
		System.out.println("myParcel1 == myParcel3: " + myParcel1.equalTo(myParcel3));
	}

}

class Parcel {
	public double width;
	public double height;
	public double depth;

	public Parcel(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public boolean equalTo(Parcel parcel) {
		if (parcel.width == this.width && parcel.height == this.height && parcel.depth == this.depth) {
			return true;
		} else {
			return false;
		}
	}
}
