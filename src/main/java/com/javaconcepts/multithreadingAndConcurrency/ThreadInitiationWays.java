/*Threads, Multithreading and Concurrency*/
package com.javaconcepts.multithreadingAndConcurrency;

public class ThreadInitiationWays {

	public static void main(String[] args) {
		System.out.println("This is the first output inside the main thread.");

		/* Creating a new thread by subclassing the 'Thread" superclass */
		Thread newThread1 = new NewThread();
		newThread1.setName("New Thread 1");
		newThread1.start();
		/* To interrupt a thread */
		newThread1.interrupt();

		/* Creating another thread by creating a anonymous Thread class */
		new Thread() {
			@Override
			public void run() {
				System.out.println("This is inside another new thread created by anonymous Thread class.");
			}
		}.start();

		/*
		 * Creating another thread using a class which implements the "Runnable"
		 * interface
		 */
		Thread newThread3 = new Thread(new RunnableThread());
		newThread3.start();

		/*
		 * Creating another thread using a class which implements the "Runnable"
		 * interface.
		 */
		Thread newThread4 = new Thread(new RunnableThread() {
			@Override
			public void run() {
				System.out.println(
						"This is inside the second new thread created by a class which implements the Runnable interface.");
			}
		});
		newThread4.start();

		System.out.println("This is the second output inside the main thread.");

	}

}
