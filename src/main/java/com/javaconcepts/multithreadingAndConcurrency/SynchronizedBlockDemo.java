/*Synchronized blocks in the method calls can be used in cases where we will 
 * not be able to change the methods to synchronized methods*/
package com.javaconcepts.multithreadingAndConcurrency;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		CallMe2 callMe2 = new CallMe2();
		Caller2 obj1 = new Caller2(callMe2, "Hello");
		Caller2 obj2 = new Caller2(callMe2, "Synchronized");
		Caller2 obj3 = new Caller2(callMe2, "World");
		obj1.t.start();
		obj2.t.start();
		obj3.t.start();
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}

class CallMe2 {
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

// Creating the thread
class Caller2 implements Runnable {
	public Thread t;
	public CallMe2 callMe2;
	public String message;

	public Caller2(CallMe2 callMe2, String message) {
		this.callMe2 = callMe2;
		this.message = message;
		t = new Thread(this);
	}

	@Override
	public void run() {
		// synchronized statement
		synchronized (this.callMe2) {
			this.callMe2.call(this.message);
		}
	}

}
