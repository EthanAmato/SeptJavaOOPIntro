package com.tts.day3;
// Insect will be an abstract class that allows you to share code among several closely related classes.
// The difference between an abstract class and an interface is that you can 1. include access modifiers,
// 2. create your own instance variables that will be passed down to classes that inherit from abstract classes
// 3. and you can create both concretely written code/methods AND abstract, unimplemented methods

// To turn a class into an 'abstract' class, we use the 'abstract' keyword:
public abstract class Insect {
	
	// All classes that inherit from Insect will have the instance variables name and numLegs.
	// We cannot provide access modifiers in interfaces nor can we require instance variables but we can
	// in abstract classes
	protected String name;
	protected Integer numLegs;
	
	public Insect(String name, Integer numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}
	
	
	// We are going to let all classes that extend abstract classes to implement their very own
	// version of the 'move()' method:
	// This is like void move(); in an interface
	public abstract void move();
	
	// But we can also define methods that have concrete implementations that ALL classes that inherit
	// from Insect will have access to
	public void eat() {
		System.out.printf("%s is eating...\n", name);
	}
	
}
