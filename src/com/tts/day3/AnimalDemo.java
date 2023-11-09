package com.tts.day3;

public class AnimalDemo {

	
//	Write a main method to test out our new interface-implementing classes
	public static void main(String[] args) {
		// These two classes (Cat and Dog) MUST have the chooseFood and makeSound
		// methods. Otherwise, Java will throw an error.
		Cat shackleton = new Cat("Shackleton", 11, "Ragdoll");
		shackleton.chooseFood();
		shackleton.makeSound();
		
		Dog marble = new Dog("Marble", 6, "Berniedoodle");
		marble.chooseFood();
		marble.makeSound();
		
		// A more realistic example of an interface in a Java project could
		// be a series of classes responsible for retrieving text from
		// different types of files...
		
		// For example, we want to make it so that we have, say, 3 different classes
		// that are each responsible for parsing one type of file each. (Note that
		// each class has a single responsibility, this is a good practice an is referred
		// to as the 'single responsibility principle in SOLID'). 
		
		// Instead of having three completely separate files that are not standardized
		// to have the same .parse() method (one may accidentally name the method 
		// parseFile() while another may name it parseTXT(), etc.), we can enforce
		// the presence of a particular method via interfaces.
		
		// So we may have package structure that looks like this:
		
		// 1. An interface called Parser that enforces the presence of a method
		// that optionally takes in a File type or nothing at all (via overloaded
		// methods), and then returns a String that has all of the text from the file.
		/* interface Parser {
		*		String parse(File file);
		*		
		*		String parse();
		* }
		* 
		* We can then make as many different classes as we want that implement
		* this Parser interface and they will all have their own version of the
		* parse() method(s) e.g. HTMLParser, TXTParser, DocxParser, PDFParser ->
		* We are able to cleanly standardize our project's classes so that the
		* user has a consistent way of parsing different files and this is also
		* a great and safe way to implement polymorphism into your classes.
		*/
		
		
		// The difference between an implementation and an extension is the type of files involved
		// 1. A class can extend another class -> properties + methods are passed from one class to another
		// 2. A class implements an interface -> the methods specified in an interface MUST be concretely
//												 written in the class
		// 3. An interface extends another interface -> when a class implements an interface that extends another
		//												interface, the class MUST write concrete code for the methods
		//												in BOTH interfaces
		
		
		
		
		
	}
	
}
