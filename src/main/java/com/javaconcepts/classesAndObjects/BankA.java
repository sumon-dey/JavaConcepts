/*A simple Java POJO (Plain Old Java Object) class*/
package com.javaconcepts.classesAndObjects;

public class BankA {

	private String customerName = "Sam";
	private double accountBalance;
	private int accountNumber;
	private String customerEmail;
	private String customerPhone;

	public void transferFund(double amountTransferred) {
		int transferLimit = 50000;
		if (amountTransferred < transferLimit) {
			this.accountBalance = this.accountBalance + amountTransferred;
			System.out.println("Amount of " + amountTransferred + " transferred successfully.");
		} else {
			System.out.println("Transfer limit exceeded. Unable to transfer " + amountTransferred);
		}
	}

	public void withdrawFund(double amountToBeWithdrawn, String name) {
		if (name.toLowerCase().equals("sam")) {
			if (amountToBeWithdrawn > accountBalance) {
				System.out.println("Insufficient Balance.");
			} else {
				accountBalance = accountBalance - amountToBeWithdrawn;
				System.out.println(amountToBeWithdrawn + " is withdrawn successfully.");
			}
		} else {
			if (amountToBeWithdrawn > accountBalance) {
				System.out.println("Insufficient Balance.");
			} else if (amountToBeWithdrawn > 50000) {
				System.out.println("You cannot withdraw more than 50,000 due to user restriction.");
			} else {
				accountBalance = accountBalance - amountToBeWithdrawn;
				System.out.println(amountToBeWithdrawn + " is withdrawn successfully.");
			}
		}
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

}
