package com.tts.day3;

// An Interface is a type of file where we as programmers
// define a series of methods that MUST be concretely written in 
// any class that implements it. If we define a method inside of 
// Animal called 'makeSound()', EVERY SINGLE CLASS that implements
// Animal MUST define their very own version of the makeSound() method.
// This is how we can have our classes be open for extension (we can write
// a series of new classes with new functionalities) WITHOUT having to modify
// already-existing, yet similar classes. 
public interface Animal {

	// We will now specify a method that MUST be implemented in every
	// subclass
	
	// We can do that in an interface by providing a return type and the
	// name of a method (with optional input arguments and their datatypes)
	void makeSound();
	
	void chooseFood();
	
}
