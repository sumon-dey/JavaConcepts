package com.javaconcepts.multithreadingAndConcurrency;

public class ThreadGroupDemo {
	/* A ThreadGroup is a class that creates a group of Threads */
	public static void main(String[] args) {
		ThreadGroup groupA = new ThreadGroup("Group A");
		ThreadGroup groupB = new ThreadGroup("Group B");
		MyNewThread ob1 = new MyNewThread("One", groupA);
		MyNewThread ob2 = new MyNewThread("Two", groupA);
		MyNewThread ob3 = new MyNewThread("Three", groupB);
		MyNewThread ob4 = new MyNewThread("Four", groupB);
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
		System.out.println("\nHere is output from list(): ");
		groupA.list();
		groupB.list();
		System.out.println();
		System.out.println("Suspending Group A...");
		Thread[] tga = new Thread[groupA.activeCount()];
		// getting the threads in group
		groupA.enumerate(tga);
		for (int i = 0; i < tga.length; i++) {
			// suspending each thread
			((MyNewThread) tga[i]).mySuspend();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Resuming Group A...");
		for (int i = 0; i < tga.length; i++) {
			// resuming threads in group
			((MyNewThread) tga[i]).myResume();
		}

		// wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish...");
			ob1.join();
			ob2.join();
			ob3.join();
			ob4.join();
		} catch (Exception e) {
			System.out.println("Exception in the main thread.");
		}
		System.out.println("Main Thread Exiting...");
	}

}

class MyNewThread extends Thread {
	boolean suspendFlag;

	public MyNewThread(String threadName, ThreadGroup tgOb) {
		super(tgOb, threadName);
		System.out.println("New Thread: " + this);
		suspendFlag = false;
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(getName() + ": " + i);
				Thread.sleep(1000);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Exception in: " + getName());
		}
		System.out.println(getName() + " exiting...");
	}

	public synchronized void mySuspend() {
		suspendFlag = true;
	}

	public synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
}
