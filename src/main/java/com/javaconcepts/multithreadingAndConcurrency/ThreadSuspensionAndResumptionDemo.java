package com.javaconcepts.multithreadingAndConcurrency;

public class ThreadSuspensionAndResumptionDemo {

	public static void main(String[] args) {
		ChildThread1 obj1 = new ChildThread1("One");
		ChildThread1 obj2 = new ChildThread1("Two");

		// start the threads
		obj1.t.start();
		obj2.t.start();

		try {
			Thread.sleep(1000);
			obj1.mySuspend();
			System.out.println("Suspending Thread One");
			Thread.sleep(1000);
			obj1.myResume();
			System.out.println("Resuming Thread One");
			obj2.mySuspend();
			System.out.println("Suspending Thread Two");
			Thread.sleep(1000);
			obj2.myResume();
			System.out.println("Resuming Thread Two");
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}

		// wait for the threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			obj1.t.join();
			obj2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread exiting......");
	}

}

class ChildThread1 implements Runnable {
	String threadName;
	Thread t;
	boolean suspendFlag;

	public ChildThread1(String threadName) {
		this.threadName = threadName;
		t = new Thread(this, this.threadName);
		System.out.println("New Thread: " + t);
		suspendFlag = false;
	}

	@Override
	public void run() {
		try {
			for (int i = 10; i > 0; i--) {
				System.out.println(threadName + ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(threadName + " interrupted.");
		}
		System.out.println(threadName + " exiting......");
	}

	public synchronized void mySuspend() {
		suspendFlag = true;
	}

	public synchronized void myResume() {
		suspendFlag = false;
		notify();
	}

}