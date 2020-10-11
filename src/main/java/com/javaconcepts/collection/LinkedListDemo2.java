package com.javaconcepts.collection;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<Address> myMailList = new LinkedList<Address>();
		myMailList.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		myMailList.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
		myMailList.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

		// display the mailing list
		for (Address address : myMailList) {
			System.out.println(address+"\n");
		}
		System.out.println();
	}

}

class Address {
	private String name, street, city, state, code;

	public Address(String name, String street, String city, String state, String code) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.code = code;
	}

	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
}
