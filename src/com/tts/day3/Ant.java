package com.tts.day3;

// To inherit from an abstract class we will use the extends keyword:
public class Ant extends Insect {

	public Ant(String name, Integer numLegs) {
		super(name, numLegs);
	}

	public void protectQueen() {
		System.out.printf("%s the ant bravely protects the queen...\n", this.name);
	}
	
	
	public void move() {
		System.out.printf("%s the ant marches towards the colony...\n", this.name);
	}

}
