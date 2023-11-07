package com.tts.oop;

/**
 * This will be a user-defined class that will define basic properties
 * of cars such as color and the model.
 */
public class Car {

	//To create your own class in Java, you typically require a couple
	// of ingredients:
	
	// 1. Instance variables (aka 'fields') -> These are variables
	//    that are accessible to each individual instantiation of a class
	//	  e.g. 'color' and 'model' are values accessible by each
	//    Car object and are therefore instance variables
	
	// To create instance variables, you can just define them as
	// regular variables in this bracket block as long as we give
	// an access modifier (public, private, protected, or default)
	
	// These are instance variables referring to the current instantiated 
	// object's color and model. The public access modifier makes it so that
	// anybody can modify or read the color and model variables directly
	// via dot notation (e.g. myCar.color)
	
	// When we don't provide a value for color or model, by default they will
	// be 'null'
	public String color;
	public String model;
	
	// The next thing we typically define in a class is the constructor -
	// just like in Javascript, the constructor is a method responsible
	// for 'constructing' or setting up an individual instance of an object
	// It can take in input and set the instance variables according to
	// the needs of the object
	
	// To create a constructor in Java, we create a method that looks like
	// this:
	// Note that the name of the method is the name of the class (Car)
	
	// By default, Java will include an 'invisible no-args constructor'
	// when we haven't defined our own Constructor yet. This basically
	// lets us instantiate objects with basically just null for instance
	// variables. It would probably look like this:
	// But now you might wonder, why the heck are we able to have 2
	// constructors in the same class?!?!? How does java know the difference?
	// The answer is that Java will decide which constructor to call based
	// on the amount and type of input parameters sent at initialization.
	// When we have 2 methods with the same name but different input args,
	// we call this 'overloading' -> It provides flexibility in how
	// methods can be called and how objects can be instantiated
	public Car() {
		// Can set default values in no-args constructor
		// if necessary
//		this.color = "White";
	}
	
	public Car(String color, String model) {		
		// To set the values of instance variables in a constructor, we can
		// use the 'this' keyword. 'this' in Java simply just refers to the current
		// instance of the object.
		
		// Sets the color and model instance variables of the current instantiation of Car to
		// the String inside of the input variable color:
		this.color = color;
		this.model = model;
	
		
		System.out.println("Constructed a car");
	}
	
	// We can now define a couple of methods that have to do with cars:
	
	// Defining a method inside of class is just like defining a method in a regular MainFile class:
	// We need an access modifier, an optional static, a return type, and a name of the function with input (if necessary):
	
	// This method can be accessed anywhere, returns nothing (void), and is named start(). Note that it is NOT
	// static - meaning that each individual object / instantiation of Car will have it's own custom version of the
	// run function. This also allows us to use the instance variables inside of the method:
	public void start() {
		if(this.color != null) {			
			System.out.printf("The %s %s is starting... \n", this.color, this.model);
		} else {
			System.out.println("The car is starting...");
		}
	}
	
	public void stop() {
		System.out.printf("The %s %s is stopping... \n", this.color, this.model);
	}
	
	public void drive() {
		System.out.printf("The %s %s drives... \n", this.color, this.model);
	}
	
	

	
	
	
	
	
	
	
	
	
}
