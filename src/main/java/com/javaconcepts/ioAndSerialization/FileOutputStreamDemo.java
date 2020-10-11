package com.javaconcepts.ioAndSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		int i;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File inputFile = new File("./src/ioAndSerialization/SampleTextFile2.txt");
			File outputFile = new File("./src/ioAndSerialization/SampleTextFile3.txt");
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			do {
				i = fis.read(); // reads a byte of data from the input stream
				if (i != -1) {
					fos.write(i);
				}
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("An I/O Error occured.");
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing file.");
			}
		}

	}

}
