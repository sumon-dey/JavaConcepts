package com.javaconcepts.classesAndObjects;

/**
 * Constructor Overloading
 * 
 * @author Sumon Dey
 *
 */
public class NewBankA {

	private String customerName;
	private double accountBalance;
	private int accountNumber;
	private String customerEmail;
	private String customerPhone;

	public NewBankA() {
		this(567.3, 123456, "Jimmy");
		System.out.println("Default Constructor called.");
	}

	public NewBankA(String customerName) {
		this.customerName = customerName;
		System.out.println("Constructor with one parameter called.");
	}

	public NewBankA(double accountBalance, int accountNumber, String customerName) {
		this("Samuel");
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		System.out.println("Constructor with three parameters called.");
	}

	public NewBankA(String customerPhone, double accountBalance) {
		this.customerPhone = customerPhone;
		this.accountBalance = accountBalance;
		System.out.println("Constructor with 2 parameters called.");
	}

}
