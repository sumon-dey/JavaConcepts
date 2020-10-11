/*Deadlock Demo*/
package com.javaconcepts.multithreadingAndConcurrency;

public class DeadlockDemo implements Runnable {

	DeadlockClass1 deadlockClass1 = new DeadlockClass1();
	DeadlockClass2 deadlockClass2 = new DeadlockClass2();
	Thread t;

	// main method
	public static void main(String[] args) {
		DeadlockDemo deadlockDemo = new DeadlockDemo();
		deadlockDemo.deadlockStart();
	}

	public DeadlockDemo() {
		Thread.currentThread().setName("MainThread");
		t = new Thread(this, "RacingThread");
	}

	public void deadlockStart() {
		t.start();
		// get lock on deadlockClass1 in this thread
		deadlockClass1.foo(deadlockClass2);
		System.out.println("Back in main thread");
	}

	@Override
	public void run() {
		// get lock on deadlockClass2 in other thread
		deadlockClass2.bar(deadlockClass1);
		System.out.println("Back in other thread");
	}

}

// 1st class
class DeadlockClass1 {
	public synchronized void foo(DeadlockClass2 deadlockClass2) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered DeadlockClass1.foo()");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("DeadlockClass1 interrupted");
		}
		System.out.println(name + " trying to call DeadlockClass2.last()");
		deadlockClass2.last();
	}

	public synchronized void last() {
		System.out.println("Inside DeadlockClass1.last()");
	}
}

// 2nd class
class DeadlockClass2 {
	public synchronized void bar(DeadlockClass1 deadlockClass1) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered DeadlockClass2.bar()");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("DeadlockClass2 interrupted");
		}
		System.out.println(name + " trying to call DeadlockClass1.last()");
		deadlockClass1.last();
	}

	public synchronized void last() {
		System.out.println("Inside DeadlockClass2.last()");
	}

}
