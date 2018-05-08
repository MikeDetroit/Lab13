package com.rockpaperscissors.gc;

public abstract class Player {

	public abstract Roshambo getRoshambo();
	
	private Roshambo roshamboValue;
	
	public Roshambo getRoshamboValue() {
		return roshamboValue;
	}
	
	public void setRoshamboValue(Roshambo roshamboValue) {
		this.roshamboValue = roshamboValue;
	}

	@Override
	public String toString() {
		return "Player [roshamboValue=" + roshamboValue + "]";
	}

	
	
	
	
	
}
