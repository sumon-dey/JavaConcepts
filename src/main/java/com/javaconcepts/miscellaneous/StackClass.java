/*Stack using array*/
package com.javaconcepts.miscellaneous;

public class StackClass {
	int[] stck = new int[10];
	int topOfStack;

	public StackClass() {
		topOfStack = -1;
	}

	// method to push item to stack
	public void push(int item) {
		if (topOfStack == 9) {
			System.out.println("Stack is full.");
		} else {
			stck[++topOfStack] = item;
		}
	}

	// method to pop item from stack
	public int pop() {
		if (topOfStack < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			return stck[topOfStack--];
		}
	}
}

class StackClassTest {
	public static void main(String[] args) {
		StackClass myStack1 = new StackClass();
		StackClass myStack2 = new StackClass();
		// pushing some items to myStack1
		for (int i = 0; i < 10; i++) {
			myStack1.push(i);
		}
		// pushing some items to myStack2
		for (int i = 10; i < 20; i++) {
			myStack2.push(i);
		}
		// popping all items from myStack1
		for (int i = 0; i < 10; i++) {
			System.out.println(myStack1.pop());
		}
		System.out.println("*******************************************************");
		// popping all items from myStack2
		for (int i = 10; i < 20; i++) {
			System.out.println(myStack2.pop());
		}
	}

}
