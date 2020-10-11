package com.javaconcepts.utilities;

import java.util.Timer;
import java.util.TimerTask;

public class TimerAndTimerTaskDemo {
	/*
	 * The "Timer" and the "TimerTask" classes offer ability to schedule a task for
	 * execution at some future time. Using these classes, we can create a thread
	 * that runs in the background, waiting for a specific time. The "Timer" is the
	 * class that will schedule a task for execution whereas the task being
	 * scheduled must be an instance of the "TimerTask" class which implements the
	 * "Runnable" interface.
	 */
	public static void main(String[] args) {
		MyTimerTask myTimerTask = new MyTimerTask();
		Timer myTimer = new Timer();
		// set an initial delay of 1 second, then repeat every half second
		myTimer.schedule(myTimerTask, 1000, 500);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			myTimer.cancel(); // this cancels the Timer thread
		}
	}

}

class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Timer task executed.");
	}

}
