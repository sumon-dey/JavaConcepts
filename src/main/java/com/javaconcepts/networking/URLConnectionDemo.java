package com.javaconcepts.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionDemo {
	/*
	 * The "URLConnection" class is a general-purpose class for accessing the
	 * attributes of a remote resource. Once a connection is made to a remote
	 * server, we can use the "URLConnection" to inspect the properties of the
	 * remote object before actually transporting it locally.
	 */
	/*
	 * The below program establishes an HTTP Connection to www.internic.net over
	 * port 80. It then displays several header values and retrieves the content.
	 */
	public static void main(String[] args) throws IOException {
		int c;
		URL url = new URL("http://www.internic.net");
		URLConnection urlConnection = url.openConnection();

		// get date
		long d = urlConnection.getDate();
		if (d == 0) {
			System.out.println("No date information.");
		} else {
			System.out.println("Date: " + new Date(d));
		}

		// get content type
		System.out.println("Content-Type: " + urlConnection.getContentType());

		// get expiration date
		d = urlConnection.getExpiration();
		if (d == 0) {
			System.out.println("No expiration information.");
		} else {
			System.out.println("Expires: " + new Date(d));
		}

		// get last-modified date
		d = urlConnection.getLastModified();
		if (d == 0) {
			System.out.println("No last-modified information.");
		} else {
			System.out.println("Last-Modified: " + new Date(d));
		}

		// get content length
		long len = urlConnection.getContentLengthLong();
		if (len == -1) {
			System.out.println("Content length unavailable.");
		} else {
			System.out.println("Content-Length: " + len);
		}

		if (len != 0) {
			System.out.println("=== Content ===");
			InputStream inputStream = urlConnection.getInputStream();
			while (((c = inputStream.read()) != -1)) {
				System.out.print((char) c);
			}
			inputStream.close();
		} else {
			System.out.println("No content available.");
		}
	}

}
