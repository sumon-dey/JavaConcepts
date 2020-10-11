package com.javaconcepts.systemAndCompiler;

import java.util.Scanner;

public class SystemClassDemo {

	/* The System class holds a collection of static variables and methods */

	public static void main(String[] args) {
		// System.out and System.in
		System.out.println("Enter a sentence: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextLine());
		System.out.println("******************************************************");

		// System.err
		System.err.println("This is an error message.");
		System.out.println("******************************************************");

		// currentTimeMillis (method to time how long various parts of our program take
		// to execute)
		// It returns the current time in milliseconds since midnight January 1, 1970
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000L; i++) {
			// do nothing
			;
		}
		endTime = System.currentTimeMillis();
		System.out.println("Elapsed Time: " + (endTime - startTime) + " (in milliseconds)");
		System.out.println("******************************************************");

		// arrayCopy (method to copy an array to another array)
		byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74 };
		byte[] b = { 77, 77, 77, 77, 77, 77, 77, 77, 77, 77 };
		System.out.println("a = " + new String(a));
		System.out.println("b = " + new String(b));
		System.out.println("************* After applying arrayCopy *************");
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println("a = " + new String(a));
		System.out.println("b = " + new String(b));
		System.out.println("******************************************************");

		// Different System Environment Properties which are available by default
		System.out.println("file.separator -> " + System.getProperty("file.separator"));
		System.out.println("line.separator -> " + System.getProperty("line.separator"));
		System.out.println("path.separator -> " + System.getProperty("path.separator"));
		System.out.println("os.arch -> " + System.getProperty("os.arch"));
		System.out.println("os.name ->" + System.getProperty("os.name"));
		System.out.println("os.version -> " + System.getProperty("os.version"));
		System.out.println("user.dir -> " + System.getProperty("user.dir"));
		System.out.println("user.home -> " + System.getProperty("user.home"));
		System.out.println("user.name -> " + System.getProperty("user.name"));
		System.out.println("java.class.path -> " + System.getProperty("java.class.path"));
		System.out.println("java.class.version -> " + System.getProperty("java.class.version"));
		System.out.println("java.compiler -> " + System.getProperty("java.compiler"));
		System.out.println("java.home -> " + System.getProperty("java.home"));
		System.out.println("java.io.tmpdir -> " + System.getProperty("java.io.tmpdir"));
		System.out.println("java.library.path -> " + System.getProperty("java.library.path"));
		System.out.println("java.specification.name -> " + System.getProperty("java.specification.name"));
		System.out.println("java.specification.vendor -> " + System.getProperty("java.specification.vendor"));
		System.out.println("java.specification.version -> " + System.getProperty("java.specification.version"));
		System.out.println("java.vendor -> " + System.getProperty("java.vendor"));
		System.out.println("java.vendor.url -> " + System.getProperty("java.vendor.url"));
		System.out.println("java.version -> " + System.getProperty("java.version"));
		System.out.println("java.vm.name -> " + System.getProperty("java.vm.name"));
		System.out.println("java.vm.specification.name -> " + System.getProperty("java.vm.specification.name"));
		System.out.println("java.vm.specification.vendor -> " + System.getProperty("java.vm.specification.vendor"));
		System.out.println("java.vm.specification.version -> " + System.getProperty("java.vm.specification.version"));
		System.out.println("java.vm.vendor -> " + System.getProperty("java.vm.vendor"));
		System.out.println("java.vm.version -> " + System.getProperty("java.vm.version"));
		System.out.println("******************************************************");
	}

}
