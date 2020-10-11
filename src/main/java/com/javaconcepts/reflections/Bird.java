package com.javaconcepts.reflections;

public class Bird extends Animal {
	private boolean walks;

	public Bird() {
		super("Cuckoo");
	}

	public boolean isWalks() {
		return walks;
	}

	public Bird(String name, boolean walks) {
		super(name);
		setWalks(walks);
	}

	public void setWalks(boolean walks) {
		this.walks = walks;
	}

	public Bird(String name) {
		super(name);
	}

	public boolean walks() {
		return walks;
	}

	@Override
	public String eats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getSound() {
		// TODO Auto-generated method stub
		return null;
	}
}
