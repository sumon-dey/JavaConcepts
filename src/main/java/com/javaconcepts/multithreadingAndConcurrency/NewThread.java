/*Threads, Multithreading and Concurrency*/
package com.javaconcepts.multithreadingAndConcurrency;

public class NewThread extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("This is inside a new thread whose name is: " + currentThread().getName());
		} catch (InterruptedException e) {
			System.out.println("The sleep of the thread \"" + currentThread().getName() + "\" is interrupted.");
			return;
		}
	}
}
