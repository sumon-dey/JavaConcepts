package com.javaconcepts.runtime;

public class RuntimeDemo1 {

	public static void main(String[] args) {
		/*
		 * The "Runtime" class encapsulates the Java Runtime Environment and helps to
		 * control the state and behavior of the JVM
		 */
		/*
		 * We cannot create an object of the Runtime class but can get a reference to
		 * the current "Runtime" object by calling the static method getRuntime()
		 */
		Runtime r = Runtime.getRuntime();

		// The "Process" is an abstract class that encapsulates a process, i.e. an
		// executing program
		Process p = null;
		try {
			p = r.exec("notepad");
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error executing Notepad.");
		}
		System.out.println("Notepad returned: " + p.exitValue());
		processBuilderDemo();
	}

	// Method to demonstrate ProcessBuilder which is another way of starting and
	// managing processes (programs)
	public static void processBuilderDemo() {
		try {
			ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile");
			proc.start();
		} catch (Exception e) {
			System.out.println("Error executing notepad.");
		}
	}

}
