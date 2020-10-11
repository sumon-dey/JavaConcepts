package com.javaconcepts.networking;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
	/*
	 * The URL class provides a simple, concise API to access information across the
	 * Internet using URLs
	 */
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://www.linkedin.com/");
		System.out.println("Protocol: " + url.getProtocol());
		System.out.println("Port: " + url.getPort()); // -1 output means that a port was not explicitly set
		System.out.println("Host: " + url.getHost());
		System.out.println("File: " + url.getFile());
		System.out.println("Ext: " + url.toExternalForm());
	}

}
