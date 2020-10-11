package com.javaconcepts.utilities;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/*The "ResourceBundle" is an abstract class that defines methods that enable us to manage a collection
 * of locale-sensitive resources, such as the strings that are used to label the user-interface elements in our
 * program. The "ResourceBundle" class has 2 subclasses -> "PropertyResourceBundle" which manages 
 * resources by using property files and "ListResourceBundle" which manages resources in an array of key/value pairs*/
public class ResourceBundleDemo {

	public static void main(String[] args) {
		// load the default bundle
		ResourceBundle rd = ResourceBundle.getBundle("SampleRB");
		System.out.println("English Version: ");
		System.out.println("String for Title key: " + rd.getString("title"));
		System.out.println("String for StopText key: " + rd.getString("StopText"));
		System.out.println("String for StartText key: " + rd.getString("StartText"));

		// load the German bundle
		rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);
		System.out.println("\nGerman Version: ");
		System.out.println("String for Title key: " + rd.getString("title"));
		System.out.println("String for StopText key: " + rd.getString("StopText"));
		System.out.println("String for StartText key: " + rd.getString("StartText"));
	}

}

class SampleRB extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		Object[][] resources = new Object[3][2];
		resources[0][0] = "title";
		resources[0][1] = "My Program";
		resources[1][0] = "StopText";
		resources[1][1] = "Stop";
		resources[2][0] = "StartText";
		resources[2][1] = "Start";
		return resources;
	}
}

class SampleRB_de extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		Object[][] resources = new Object[3][2];
		resources[0][0] = "title";
		resources[0][1] = "Mein Programm";
		resources[1][0] = "StopText";
		resources[1][1] = "Anschlag";
		resources[2][0] = "StartText";
		resources[2][1] = "Anfang";
		return resources;
	}
}