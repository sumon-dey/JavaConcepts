package com.javaconcepts.lambdas;

public class LambdaVariableCapture {
	/*
	 * Lambda expression can use and modify an instance variable from its invoking
	 * class. It just can't use a local variable of its enclosing scope unless that
	 * variable is effectively "final".
	 */
	static int staticVar = 24;
	int instanceVar = 44;

	public static void main(String[] args) {
		LambdaVariableCapture obj = new LambdaVariableCapture();
		int localVar = 10; // this should act as an effectively final variable
		MyFunc myLambda = (int n) -> {
			// this does not modify the local variable "localVar"
			int lambdaLocalVar = localVar + n;

			// the below is illegal since this tries to modify localVar
			// localVar++;

			// the below is also ok
			lambdaLocalVar = staticVar + n;
			lambdaLocalVar = obj.instanceVar + n;
			return lambdaLocalVar;
		};

		// the below will also throw error since here we are removing the "effectively
		// final" nature of the local variable
		// localVar = 11;

		System.out.println("Output is: " + myLambda.func(2));
	}

}

interface MyFunc {
	public abstract int func(int n);
}
