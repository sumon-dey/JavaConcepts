/*IsAlive and Join Demo*/
package com.javaconcepts.multithreadingAndConcurrency;

public class IsAliveAndJoinDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new NewThread3("One"), "One");
		Thread t2 = new Thread(new NewThread3("Two"), "Two");
		Thread t3 = new Thread(new NewThread3("Three"), "Three");

		// starting the child threads
		t1.start();
		t2.start();
		t3.start();

		// checking whether the threads are alive (before join)
		System.out.println("Thread One is alive: " + t1.isAlive());
		System.out.println("Thread Two is alive: " + t2.isAlive());
		System.out.println("Thread Three is alive: " + t3.isAlive());
		System.out.println("*******************************************************");

		// waiting for the threads to finish
		try {
			System.out.println("Waiting for the threads to finish...");
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted");
		}

		// checking whether the threads are alive (after join)
		System.out.println("Thread One is alive: " + t1.isAlive());
		System.out.println("Thread Two is alive: " + t2.isAlive());
		System.out.println("Thread Three is alive: " + t3.isAlive());
		System.out.println("*******************************************************");
	}

}

class NewThread3 implements Runnable {
	public String threadName;

	public NewThread3(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Child Thread " + threadName + " [" + i + "]");
			}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread " + threadName + " interrupted ");
		}
		System.out.println("Child Thread " + threadName + " exiting......");
	}

}
