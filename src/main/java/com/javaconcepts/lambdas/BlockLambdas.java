package com.javaconcepts.lambdas;

/*Block Lambdas*/
public class BlockLambdas {

	public static void main(String[] args) {
		BlockLambdas1 blockLambdas1 = new BlockLambdas1();
		blockLambdas1.factorial();
		System.out.println("*******************************************");
		BlockLambdas2 blockLambdas2 = new BlockLambdas2();
		blockLambdas2.stringReversal();
		System.out.println("*******************************************");
	}

}

class BlockLambdas1 {
	public void factorial() {
		// the below block lambda computes and returns the factorial of an int value
		NumericFunc numericFunc = (int n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = i * result;
			}
			return result;
		};
		System.out.println("Factorial of 3 is: " + numericFunc.func(3));
		System.out.println("Factorial of 5 is: " + numericFunc.func(5));
	}
}

class BlockLambdas2 {
	public void stringReversal() {
		// the below block lambda reverses the characters in a String
		StringFunc stringFunc = (str) -> {
			String reverse = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse += str.charAt(i);
			}
			return reverse;
		};
		System.out.println("The reverse of School is: " + stringFunc.func("School"));
		System.out.println("The reverse of Development is: " + stringFunc.func("Development"));
	}
}

interface NumericFunc {
	public abstract int func(int n);
}

interface StringFunc {
	public abstract String func(String n);
}
