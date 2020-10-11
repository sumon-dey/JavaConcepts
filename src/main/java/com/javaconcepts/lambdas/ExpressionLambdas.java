/*A lambda expression is not executed on its own, rather it forms the implementation of the abstract method defined by the
    functional interface that specifies its target type. Hence, a lambda expression can be specified only in a context in which a
    target type is defined. The contexts are: it is assigned to a functional interface reference, during variable initialization, 
    return statements and method arguments.*/
package com.javaconcepts.lambdas;
/*Expression Lambdas*/
public class ExpressionLambdas {

	public static void main(String[] args) {

		// declare a Functional Interface reference
		MyNumber myNum;

		// here, the lambda expression is simply a constant expression. When it is
		// assigned to myNum, a class instance is constructed in which the lambda
		// expression implements the getValue() method in MyNumber.
		myNum = () -> 123.45;

		// call the getValue() method which is provided by the previously assigned
		// lambda expression
		System.out.println(myNum.getValue());

		// a lambda expression must be compatible with the method defined by the
		// Functional interface. Therefore, the below won't work
		// myNum = ()-> "123.45";
		System.out.println("**********************************************");
		NumericTest1 isEven;
		// below is an "Expression Lambda" having "Expression Body" since it consists of
		// a single expression
		isEven = (n) -> (n % 2) == 0;
		System.out.println("Is 10 even?: " + isEven.test(10));
		System.out.println("Is 9 even?: " + isEven.test(9));

		NumericTest1 isNonNeg;
		isNonNeg = (n) -> n > 0;
		System.out.println("Is 1 non-negative?: " + isNonNeg.test(1));
		System.out.println("Is -1 non-negative?: " + isNonNeg.test(-1));
		System.out.println("**********************************************");

		NumericTest2 isFactor;
		isFactor = (n, d) -> (n % d) == 0;
		System.out.println("Is 2 factor of 10?: " + isFactor.test(10, 2));
		System.out.println("Is 3 factor of 10?: " + isFactor.test(10, 3));
		System.out.println("**********************************************");
	}

}

interface MyNumber {
	public abstract double getValue();
}

interface NumericTest1 {
	public abstract boolean test(int n);
}

interface NumericTest2 {
	public abstract boolean test(int n, int d);
}
