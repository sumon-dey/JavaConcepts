package com.javaconcepts.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		int i;
		double d;
		boolean b;
		String str;

		// write output to a file
		try {
			FileWriter fout = new FileWriter("./files/SampleTextFile2.txt");
			fout.write("Testing Scanner 10 12.2 one true two false");
			fout.close();
			FileReader fin = new FileReader("./files/SampleTextFile2.txt");
			Scanner src = new Scanner(fin);
			// read to end
			while (src.hasNext()) {
				if (src.hasNextInt()) {
					i = src.nextInt();
					System.out.println("int: " + i);
				} else if (src.hasNextDouble()) {
					d = src.nextDouble();
					System.out.println("double: " + d);
				} else if (src.hasNextBoolean()) {
					b = src.nextBoolean();
					System.out.println("boolean: " + b);
				} else {
					str = src.next();
					System.out.println("String: " + str);
				}
			}
			src.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
