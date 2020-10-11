package com.javaconcepts.networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * Datagrams are bundles of information passed between machines. Java implements
 * datagrams on top of the UDP protocol by using the 2 classes ->
 * "DatagramPacket" (this is the data container) and "DatagramSocket" (this is
 * the mechanism used to send or receive the datagram packets)
 */
/*
 * The below program implements a simple networked communication client and
 * server. Messages are typed into the window at the server and written across
 * the network to the client side, where they are displayed.
 */
public class DatagramDemo {
	public static int serverPort = 998;
	public static int clientPort = 999;
	public static int buffer_size = 1024;
	public static DatagramSocket ds;
	public static byte[] buffer = new byte[buffer_size];

	public static void main(String[] args) throws Exception {
		if (args.length == 1) {
			ds = new DatagramSocket(serverPort);
			TheServer();
		} else {
			ds = new DatagramSocket(clientPort);
			TheClient();
		}
	}

	// the Server (run with the command -> java WriteServer)
	public static void TheServer() throws Exception {
		int pos = 0;
		while (true) {
			int c = System.in.read();
			switch (c) {
			case -1:
				System.out.println("Server Quits.");
				ds.close();
				return;
			case '\r':
				break;
			case '\n':
				ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
				pos = 0;
				break;
			default:
				buffer[pos++] = (byte) c;
			}
		}
	}

	// the Client (run with the command -> java WriteServer 1)
	public static void TheClient() throws Exception {
		while (true) {
			DatagramPacket p = new DatagramPacket(buffer, buffer.length);
			ds.receive(p);
			System.out.println(new String(p.getData(), 0, p.getLength()));
		}
	}

}
