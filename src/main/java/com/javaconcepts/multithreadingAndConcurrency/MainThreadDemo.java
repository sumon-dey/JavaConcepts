/*Main Thread and important thread methods*/
package com.javaconcepts.multithreadingAndConcurrency;

public class MainThreadDemo {
	/*
	 * Important Thread methods: setName, getName, setPriority, getPriority,
	 * isAlive, join, run, sleep, start
	 */
	public static void main(String[] args) {
		System.out.println("Checking the main thread");
		Thread mainThread = Thread.currentThread();
		System.out.println("Before name change, the thread is:  " + mainThread);
		mainThread.setName("My Main Thread");
		mainThread.setPriority(1);
		// MIN_PRIORITY, MAX_PRIORITY, NORM_PRIORITY are public static final int
		// variables in the "Thread" class
		// The priority range should be between MIN_PRIORITY=1 and MAX_PRIORITY=10
		// to return to default priority, specify NORM_PRIORITY=5
		System.out.println("After name change, the thread is:  " + mainThread);
		System.out.println("After name change, the name of the thread is: " + mainThread.getName());
		System.out.println("Priority of the thread is: " + mainThread.getPriority());
		System.out.println("Is the main thread alive?: " + mainThread.isAlive());
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Count[" + i + "]");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			System.out.println("The main thread is interrupted");
		}

		// Thread State
		// A thread can have the following states - BLOCKED, NEW, RUNNABLE, TERMINATED,
		// TIMED_WAITING, WAITING
		Thread.State ts = Thread.currentThread().getState();
		System.out.println("Thread State is: " + ts);
	}

}
