/*Creating a thread by extending  the "Thread" class as superclass*/
package com.javaconcepts.multithreadingAndConcurrency;

public class ThreadFromSuperclassThreadDemo {

	public static void main(String[] args) {

		// New Child Thread
		NewThread2 newThread2 = new NewThread2();
		newThread2.start();

		// Continuing with the main thread
		System.out.println("Main Thread: " + Thread.currentThread());
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Main Thread: [" + i + "]");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting......");
	}

}

class NewThread2 extends Thread {

	public NewThread2() {
		super("Demo Thread");
		System.out.println("Child Thread: " + this);
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Child Thread: [" + i + "]");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child Thread Exiting......");
	}

}
