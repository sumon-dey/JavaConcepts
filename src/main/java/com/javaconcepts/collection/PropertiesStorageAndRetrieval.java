package com.javaconcepts.collection;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesStorageAndRetrieval {

	public static void main(String[] args) {
		try {
			Properties ht = new Properties();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String name, number;
			FileInputStream fileInputStream = null;
			boolean changed = false;
			fileInputStream = new FileInputStream("phonebook.dat");
			if (fileInputStream != null) {
				ht.load(fileInputStream);
				fileInputStream.close();
			}
			do {
				System.out.println("Enter new name ('quit' to stop): ");
				name = bufferedReader.readLine();
				if (name.equals("quit")) {
					continue;
				}
				System.out.println("Enter number: ");
				number = bufferedReader.readLine();
				ht.put(name, number);
				changed = true;
			} while (!name.equals("quit"));
			// if phonebook dara has changed, save it
			if (changed) {
				FileOutputStream fileOutputStream = new FileOutputStream("phonebook.dat");
				ht.store(fileOutputStream, "Telephone Book");
				fileOutputStream.close();
			}
			// look up numbers given a name
			do {
				System.out.println("Enter name to find ('quit' to quit): ");
				name = bufferedReader.readLine();
				if (name.equals("quit")) {
					continue;
				}
				number = (String) ht.get(name);
				System.out.println(number);
			} while (!name.equals("quit"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
