package com.javaconcepts.classesAndObjects;

/**
 * Classes, Objects and Constructors Demo
 * 
 * @author Sumon Dey
 *
 */
public class BankCustomerMainProgram {

	public static void main(String[] args) {
		BankA customerSam = new BankA();
		customerSam.setAccountBalance(500);
		customerSam.transferFund(60000);
		customerSam.transferFund(40000);
		System.out.println("Your current account balance is: " + customerSam.getAccountBalance());
		customerSam.withdrawFund(20000, "Sam");
		customerSam.transferFund(40000);
		customerSam.withdrawFund(60000, "Sam");
		System.out.println("Your current account balance is: " + customerSam.getAccountBalance());
		System.out.println("***************************************************************");

		BankA customerJim = new BankA();
		customerJim.setAccountBalance(500);
		customerJim.transferFund(60000);
		customerJim.transferFund(40000);
		System.out.println("Your current account balance is: " + customerJim.getAccountBalance());
		customerJim.withdrawFund(20000, "Jim");
		customerJim.transferFund(40000);
		customerJim.withdrawFund(60000, "Jim");
		System.out.println("Your current account balance is: " + customerJim.getAccountBalance());
		System.out.println("***************************************************************");

		NewBankA variableCustomer1 = new NewBankA();
		NewBankA variableCustomer2 = new NewBankA("Jack");
		NewBankA variableCustomer3 = new NewBankA("(123) 456 789", 123456);
		System.out.println("***************************************************************");

	}

}
