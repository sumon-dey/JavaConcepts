package com.javaconcepts.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	/*
	 * The "InetAddress" class is used to encapsulate both the numerical IP Address
	 * and the domain name for that address. It can handle both IPv4 and IPv6
	 * addresses. We interact with this class by using the name of an IP host (which
	 * is more convenient and understandable than its IP address). The InetAddress
	 * class hides the number inside.
	 */
	/*
	 * Factory Methods -> A convention whereby static methods in a class return an
	 * instance of the class
	 */
	public static void main(String[] args) throws UnknownHostException {

		// getLocalHost() ->returns the InetAddress object that represents the localhost
		// getHostName() -> returns the host name associated with the InetAddress object
		// as String
		// getHostAddress() -> returns the host adddress associated with the InetAddress
		// object as String
		// isMulticastAddress() -> returns true if the address is a multicast address,
		// otherwise returns false
		// getAddress() -> returns a byte array that represents the object's IP address
		// in network byte order
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("getLocalHost() -> " + address);
		System.out.println("getHostName() -> " + address.getHostName());
		System.out.println("getHostAddress() -> " + address.getHostAddress());
		// System.out.println("isMulticastAddress() -> " +
		// address.isMulticastAddress());
		byte[] addressInByte = address.getAddress();
		for (int i = 0; i < addressInByte.length; i++) {
			System.out.println("getAddress()  -> " + addressInByte[i]);
		}
		System.out.println("****************************************************");

		// getByName() ->
		address = InetAddress.getByName("www.HerbSchildt.com");
		System.out.println("getByName() -> " + address);
		System.out.println("getHostName() -> " + address.getHostName());
		System.out.println("getHostAddress() -> " + address.getHostAddress());
		System.out.println("****************************************************");

		// getAllByName() ->
		InetAddress[] SW = InetAddress.getAllByName("www.nba.com");
		System.out.println("getAllByName()  -> ");
		for (int i = 0; i < SW.length; i++) {
			System.out.println(SW[i]);
		}
		System.out.println("****************************************************");
	}

}
