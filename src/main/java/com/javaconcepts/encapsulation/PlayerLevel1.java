package com.javaconcepts.encapsulation;

public class PlayerLevel1 {
	public String playerName;
	public int gameHealth;

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
