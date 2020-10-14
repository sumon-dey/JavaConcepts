package com.javaconcepts.encapsulation;

public class PlayerLevel2 {

	private String playerName;
	private int gameHealth = 100;

	public PlayerLevel2(String playerName, int gameHealth) {
		this.playerName = playerName;
		if (gameHealth > 0 && gameHealth <= 100) {
			this.gameHealth = gameHealth;
		}
	}

	public void loseGameHealth(int damageDone) {
		this.gameHealth -= damageDone;
		if (this.gameHealth <= 0) {
			System.out.println("Player knocked out");
		}
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getGameHealth() {
		return gameHealth;
	}

	public void setGameHealth(int gameHealth) {
		this.gameHealth = gameHealth;
	}

}
