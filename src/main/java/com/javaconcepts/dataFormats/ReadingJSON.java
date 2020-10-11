package com.javaconcepts.dataFormats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadingJSON {

	public static void main(String[] args) {
		try {
			File file = new File("./jsonFiles/Sample.json");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			readJsonFile(bufferedReader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readJsonFile(BufferedReader bufferedReader) {
		try {
			JSONParser myJSONParser = new JSONParser();
			Object newObject = myJSONParser.parse(bufferedReader);
			JSONObject jsonObject1=(JSONObject)newObject;
			System.out.println(jsonObject1.get("name"));
			System.out.println(jsonObject1.get("age"));
			System.out.println(jsonObject1.get("location"));
			System.out.println(jsonObject1.get("hobby"));
			System.out.println(jsonObject1.get("passion"));
			JSONArray jsonArray1=(JSONArray)jsonObject1.get("phonenumbers");
			System.out.println("First phone number is: "+jsonArray1.get(0));
			System.out.println("Second phone number is: "+jsonArray1.get(1));
			JSONObject jsonObject2=(JSONObject)jsonObject1.get("address");
			System.out.println("First address is: "+jsonObject2.get("Address1"));
			System.out.println("Second address is: "+jsonObject2.get("Address2"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
