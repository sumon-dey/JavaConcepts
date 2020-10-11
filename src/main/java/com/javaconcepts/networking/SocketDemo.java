package com.javaconcepts.networking;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemo {
	/*
	 * The "ServerSocket" class is for the servers and they act as "listeners" in
	 * the TCP/IP protocol. It is used to create servers that listen for either
	 * local or remote client programs to connect to them on published ports. When
	 * we create a ServerSocket, it will register itself with the system as having
	 * an interest in client connections.
	 */
	/*
	 * The "Socket" class is for the clients. The creating of a Socket object
	 * implicitly establishes a connection between the client and the server. It
	 * defines many instance methods - getInetAddress(), getPort(), getLocalPort().
	 * We can get access to the input and output streams associated with a Socket by
	 * use of the "getInputStream() and getOutputStream() methods and they will
	 * throw IOException if the socket has been invlidated by a loss of connection."
	 * Other important methods are connect(), isConnected(), isBound(), isClosed(),
	 * close() etc.
	 */
	public static void main(String[] args) throws Exception {
		int c;
		// create a socket connected to internic.net, port 43
		Socket s = new Socket("whois.internic.net", 43);

		// obtain input and output streams
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();

		// construct a request string
		String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";

		// convert to bytes
		byte[] buf = str.getBytes();

		// send request
		out.write(buf);

		// read and display reponse
		while ((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		s.close();
	}

}
