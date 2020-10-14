package com.javaconcepts.encapsulation;

/**
 * Encapsulation:
 * 
 * Encapsulation is a mechanism that binds together code and data and keeps them
 * safe from outside access, intereference and misuse. It acts like a protective
 * wrapper to prevent the code and data from being accessed by some other code
 * defined outside the wrapper.
 * 
 * @author Sumon Dey
 *
 */
public class VideoGame_MainProgram {

	public static void main(String[] args) {
		/* Without Encapsulation */
		PlayerLevel1 myPlayer1 = new PlayerLevel1();
		myPlayer1.playerName = "Sam";
		myPlayer1.gameHealth = 20;
		myPlayer1.loseGameHealth(10);
		System.out.println("The health of the player " + myPlayer1.playerName + " is " + myPlayer1.getGameHealth());
		myPlayer1.loseGameHealth(11);
		System.out.println("The health of the player " + myPlayer1.playerName + " is " + myPlayer1.getGameHealth());
		System.out.println("************************************************************************************");

		/* With Encapsulation */
		PlayerLevel2 myPlayer2 = new PlayerLevel2("John", 50);
		System.out.println("Initial health is: " + myPlayer2.getGameHealth());
		PlayerLevel2 myPlayer3 = new PlayerLevel2("John", 200);
		System.out.println("Initial health is: " + myPlayer3.getGameHealth());
		System.out.println("************************************************************************************");
	}

}
