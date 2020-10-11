/*wait(), notify() and notifyAll() methods are final methods of the "Object" class and hence all classes have them.
 * All three methods can only be called from within a "synchronized" context*/
package com.javaconcepts.multithreadingAndConcurrency;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		Unique unique = new Unique();
		Producer producer = new Producer(unique);
		Consumer consumer = new Consumer(unique);

		/// start the threads
		producer.t.start();
		consumer.t.start();

		System.out.println("Press Ctrl+C to Stop.");

	}

}

class Unique {
	int number;
	boolean valueSet = false;

	// "get" method
	public synchronized int get() {
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException Caught");
			}
		System.out.println("Got: " + number);
		valueSet = false;
		notify();
		return number;
	}

	// "put" method
	public synchronized void put(int number) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException Caught");
			}
		this.number = number;
		valueSet = true;
		System.out.println("Put: " + number);
		notify();
	}
}

// Producer class
class Producer implements Runnable {
	Unique unique;
	Thread t;

	public Producer(Unique unique) {
		this.unique = unique;
		t = new Thread(this, "Producer");
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			unique.put(i++);
		}
	}

}

// Consumer class
class Consumer implements Runnable {
	Unique unique;
	Thread t;

	public Consumer(Unique unique) {
		this.unique = unique;
		t = new Thread(this, "Consumer");
	}

	@Override
	public void run() {
		while (true) {
			unique.get();
		}
	}

}
