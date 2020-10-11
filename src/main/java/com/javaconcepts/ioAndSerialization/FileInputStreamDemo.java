package com.javaconcepts.ioAndSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		int i;
		FileInputStream fis = null;
		try {
			File file = new File("./src/ioAndSerialization/SampleTextFile2.txt");
			fis = new FileInputStream(file);
			do {
				i = fis.read(); // reads a byte of data from the input stream
				if (i != -1) {
					System.out.print((char) i);
				}
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("An I/O Error occured.");
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing file");
			}
		}

	}

}
