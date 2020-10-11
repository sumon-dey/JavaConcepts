package com.javaconcepts.networking;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLConnectionDemo {
	/*
	 * The "HttpURLConnection" is a subclass of the "URLConnection" class and it
	 * provides support for HTTP Connections.
	 */
	/*
	 * The below program demonstrates HttpURLConnection. It first establishes a
	 * connection to www.google.com. It then displays the request method,
	 */
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.google.com");
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

		// display request method
		System.out.println("Request Method is: " + httpURLConnection.getRequestMethod());

		// display response code
		System.out.println("Response Code is: " + httpURLConnection.getResponseCode());

		// display response message
		System.out.println("Response Message is: " + httpURLConnection.getResponseMessage());

		// get a list of the header fields and a set of the header keys
		Map<String, List<String>> headerMap = httpURLConnection.getHeaderFields();

		Set<String> headerField = headerMap.keySet();
		System.out.println("\nHere is the header: ");

		// display all header keys and values
		for (String key : headerField) {
			System.out.println("Key: " + key + "Value: " + headerMap.get(key));
		}
	}

}
