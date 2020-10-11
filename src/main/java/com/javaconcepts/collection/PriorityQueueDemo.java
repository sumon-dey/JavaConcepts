package com.javaconcepts.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	/*
	 * The "PriorityQueue" class extends the "AbstractQueue" class and implements
	 * the "Queue" interface. It creates a queue that is prioritized based on the
	 * queue's comparator.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> myPriorityQueue = new PriorityQueue<String>();
		myPriorityQueue.add("Beta");
		myPriorityQueue.add("Alpha");
		myPriorityQueue.add("Eta");
		myPriorityQueue.add("Gamma");
		myPriorityQueue.add("Epsilon");
		myPriorityQueue.add("Omega");
		System.out.println("Contents of myPriorityQueue: " + myPriorityQueue);
	}

}
