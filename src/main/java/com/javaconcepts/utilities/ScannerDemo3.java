package com.javaconcepts.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo3 {
	/* Setting the Delimiters */
	public static void main(String[] args) {
		int count = 0;
		double sum = 0.0;
		// write output to a file
		try {
			FileWriter fout = new FileWriter("./files/SampleTextFile1.txt");
			// storing values in a comma-separated list
			fout.write("2, 3.4,    5,6,  7.4,  9.1,  10.5, done");
			fout.close();
			FileReader fin = new FileReader("./files/SampleTextFile1.txt");
			Scanner src = new Scanner(fin);
			// setting delimiters to space and comma
			src.useDelimiter(", *");
			// read and sum numbers
			while (src.hasNext()) {
				if (src.hasNextDouble()) {
					sum += src.nextDouble();
					count++;
				} else {
					String str = src.next();
					if (str.equals("done")) {
						break;
					} else {
						System.out.println("file Format Error.");
						return;
					}
				}
			}
			src.close();
			System.out.println("Average is " + sum / count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
