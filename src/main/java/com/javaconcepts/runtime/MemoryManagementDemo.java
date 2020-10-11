package com.javaconcepts.runtime;

public class MemoryManagementDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		Integer[] someInts = new Integer[1000];
		System.out.println("Total Memory: " + r.totalMemory());
		mem1 = r.freeMemory();
		System.out.println("Initial Free Memory: " + mem1);
		// the below runs garbage collector to recycle unused objects
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("After garbage collection, Free Memory: " + mem1);
		for (int i = 0; i < 1000; i++) {
			someInts[i] = Integer.valueOf(i);
		}
		mem2 = r.freeMemory();
		System.out.println("After allocation, Free Memory: " + mem2);
		System.out.println("Memory used by allocation: " + (mem1 - mem2));
		for (int i = 0; i < 1000; i++) {
			someInts[i] = null;
		}
		r.gc();
		mem2 = r.freeMemory();
		System.out.println("After collecting discarded Integers, Free Memory: " + mem2);
	}

}
