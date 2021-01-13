/*Interface Variables are implicitly "final" and "static" and 
are basically constants that can be shared to the classes which 
are implementing the interface */
package com.javaconcepts.interfaces;

import java.util.Random;

public interface IInterfaceVariables {
	int NO = 0;
	int YES = 1;
	int MAYBE = 2;
	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
}

class Question implements IInterfaceVariables {
	public int ask() {
		int prob = (int) (100 * (new Random()).nextDouble());
		if (prob < 20) {
			return NO;
		} else if (prob < 30) {
			return YES;
		} else if (prob < 55) {
			return LATER;
		} else if (prob < 68) {
			return SOON;
		} else if (prob < 98) {
			return MAYBE;
		} else {
			return NEVER;
		}
	}
}

class AskMe implements IInterfaceVariables {
	public void answer(int result) {
		switch (result) {
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("Yes");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
		case LATER:
			System.out.println("Later");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case NEVER:
			System.out.println("Never");
			break;
		}
	}
}
