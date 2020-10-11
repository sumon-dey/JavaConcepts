package com.javaconcepts.ioAndSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {

	private double length;
	private double breadth;
	/* This field will not be serialized since it is declared transient */
	private transient double height;
	private static String filePath = "./src/ioAndSerialization/SampleBoxFile.txt";

	public static void main(String[] args) {
		Box myOldBox = new Box(5, 3.2, 4);
		myOldBox.serialization(filePath);
		Box myNewBox = new Box();
		myNewBox.deserialization(filePath);
	}

	/*
	 * Serializing (or flattening) the object of the Box class with its non-
	 * transient fields and other related objects.
	 */
	private void serialization(String filePath) {
		try {
			File file = new File(filePath);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(this);
			objectOutputStream.close();
			System.out.println("Serialization Completed Successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* Deserializing the serialized object */
	private void deserialization(String filePath) {
		try {
			File file = new File(filePath);
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Box myNewBox = (Box) objectInputStream.readObject();
			System.out.println("After deserializing, the length of the new Box is: " + myNewBox.length);
			System.out.println("After deserializing, the breadth of the new Box is: " + myNewBox.breadth);
			System.out.println("After deserializing, the height of the new Box is: " + myNewBox.height);
			objectInputStream.close();
			System.out.println("Deserialization Completed Successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Box(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public Box() {

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
