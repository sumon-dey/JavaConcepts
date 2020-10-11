/*Composition*/
package com.javaconcepts.composition;

public class Family {
	private int numberOfFamilyMembers;
	private String fatherName;
	private int siblings;

	public Family(int numberOfFamilyMembers, String fatherName, int siblings) {
		this.numberOfFamilyMembers = numberOfFamilyMembers;
		this.fatherName = fatherName;
		this.siblings = siblings;
	}

	public int getNumberOfFamilyMembers() {
		return numberOfFamilyMembers;
	}

	public void setNumberOfFamilyMembers(int numberOfFamilyMembers) {
		this.numberOfFamilyMembers = numberOfFamilyMembers;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getSiblings() {
		return siblings;
	}

	public void setSiblings(int siblings) {
		this.siblings = siblings;
	}

}
