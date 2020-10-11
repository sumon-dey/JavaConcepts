/*Writing to a text file and reading from it.*/
package com.javaconcepts.ioAndSerialization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReader {
	private static String filePath = "./src/ioAndSerialization/SampleTextFile1.txt";

	public static void main(String[] args) {
		writeToFile(filePath);
		readFromFile(filePath);
	}

	/* To write to a text file using FileWriter and BufferedWriter */
	private static void writeToFile(String filePath) {
		try {
			File file = new File(filePath);
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("This is a sample text written in the text file. \n");
			bufferedWriter.write("... and this is more text.");
			bufferedWriter.close();
			System.out.println("************* Writing to the file is successfully completed.************");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* To read from a text file using FileReader and BufferedReader */
	private static void readFromFile(String filePath) {
		try {
			File file = new File(filePath);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
			System.out.println("************* Reading from the file is successfully completed.************");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
