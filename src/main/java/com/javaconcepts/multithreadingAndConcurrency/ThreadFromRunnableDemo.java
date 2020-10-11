/*Creating a thread using the "Runnable" Interface*/
package com.javaconcepts.multithreadingAndConcurrency;

public class ThreadFromRunnableDemo {

	public static void main(String[] args) {

		// New Child Thread
		NewThread1 newThread1 = new NewThread1();
		newThread1.t.start();

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
		System.out.println("Exiting Main Thread......");
	}

}

class NewThread1 implements Runnable {
	public Thread t;

	public NewThread1() {
		t = new Thread(this, "Demo thread");
		System.out.println("Child Thread: " + t);
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
		System.out.println("Exiting Child Thread......");
	}

}
