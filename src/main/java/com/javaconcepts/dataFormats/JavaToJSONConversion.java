package com.javaconcepts.dataFormats;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class converts Java object to JSON and stores in a JSON file
 * 
 * @author Sumon Dey
 *
 *
 */
public class JavaToJSONConversion {

	public static void main(String[] args) {
		try {
			File file = new File("./jsonFiles/Person.json");
			ObjectMapper objectMapper = new ObjectMapper();
			Person sam = new Person();
			sam.setName("Sam");
			sam.setAge(30);
			sam.setAddress("Pune");
			sam.setHeight(1.72);
			objectMapper.writeValue(file, sam);
			System.out.println("JSON file created successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
