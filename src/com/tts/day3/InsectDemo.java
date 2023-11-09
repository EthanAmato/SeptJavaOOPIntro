package com.tts.day3;

public class InsectDemo {

	public static void main(String[] args) {
		// We are not able to instantiate interfaces or abstract classes:
		// Insect myInsect = new Insect(); // NOT ALLOWED
		// Animal myAnimal = new Animal(); // NOT ALLOWED

		// We have no problem instantiating an Ant because this is a concrete class that just
		// extends an implements all methods, instance variables, constructors, etc. from abstract class Insect
		Ant myAnt = new Ant("Antony", 6);
		myAnt.eat();
		myAnt.protectQueen();
		myAnt.move();
		
		
	}

}
