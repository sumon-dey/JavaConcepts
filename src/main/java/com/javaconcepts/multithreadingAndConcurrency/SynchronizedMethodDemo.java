/*Race Condition -> where multiple threads are trying to access the same method, on the same object, at the same time */
package com.javaconcepts.multithreadingAndConcurrency;

public class SynchronizedMethodDemo {

	public static void main(String[] args) {
		CallMe target = new CallMe();
		Caller obj1 = new Caller(target, "Hello");
		Caller obj2 = new Caller(target, "Synchronized");
		Caller obj3 = new Caller(target, "World");

		// starting the threads
		obj1.t.start();
		obj2.t.start();
		obj3.t.start();

		// waiting for the threads to end
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}

class CallMe {
	// Non-synchronized method (we have to make the below method synchronized to get
	// the desired output)
	public void call(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	public String message;
	public CallMe callMe;
	Thread t;

	public Caller(CallMe callMe, String message) {
		this.callMe = callMe;
		this.message = message;
		t = new Thread(this);
	}

	@Override
	public void run() {
		callMe.call(message);
	}

}
