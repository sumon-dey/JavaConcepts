/*Invoking 4 child threads (in addition to the main thread) from the same program*/
package com.javaconcepts.multithreadingAndConcurrency;

public class InvokingMultipleThreads {

	public static void main(String[] args) {

		// Invoking 4 child threads
		ChildThread childThreadOne = new ChildThread("One");
		ChildThread childThreadTwo = new ChildThread("Two");
		ChildThread childThreadThree = new ChildThread("Three");
		ChildThread childThreadFour = new ChildThread("Four");
		childThreadOne.t.start();
		childThreadTwo.t.start();
		childThreadThree.t.start();
		childThreadFour.t.start();

		// Continuing with the main thread to ensure that the main thread is the last
		// thread to exit
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread exiting......");
	}

}

class ChildThread implements Runnable {
	String threadName;
	Thread t;

	public ChildThread(String threadName) {
		this.threadName = threadName;
		t = new Thread(this, this.threadName);
		System.out.println("Child Thread: " + t);
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Child Thread " + this.threadName + " [" + i + "]");
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread " + this.threadName + " interrupted");
		}
		System.out.println("Child Thread " + this.threadName + " exiting......");
	}

}
