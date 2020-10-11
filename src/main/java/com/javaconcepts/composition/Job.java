/*Composition*/
package com.javaconcepts.composition;

public class Job {
	private double salary;
	private String officeLocation;
	private int leavesInDays;

	public Job(double salary, String officeLocation, int leavesInDays) {
		this.salary = salary;
		this.officeLocation = officeLocation;
		this.leavesInDays = leavesInDays;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public int getLeavesInDays() {
		return leavesInDays;
	}

	public void setLeavesInDays(int leavesInDays) {
		this.leavesInDays = leavesInDays;
	}
}
