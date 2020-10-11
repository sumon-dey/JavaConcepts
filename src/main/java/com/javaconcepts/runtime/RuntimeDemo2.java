package com.javaconcepts.runtime;

public class RuntimeDemo2 {
	// The below will work only in JDK9 and above
	public static void main(String[] args) {
		Runtime.Version runVer = Runtime.version();

		// Display the information about the Java Runtime
		System.out.println("Major version: " + runVer.major());
		System.out.println("Minor version: " + runVer.minor());
		System.out.println("Security version: " + runVer.security());
		System.out.println("Build Number: " + runVer.build());
		System.out.println("Pre Release Information: " + runVer.pre());
		System.out.println("Other optional information: " + runVer.optional());
	}

}
