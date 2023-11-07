package com.tts.day2;

import java.util.ArrayList;

public class Person {
	
	//	Instance variables -> Variables associated with an individual object (an INSTANCE of the class)
	
	// All people have names and all people have ages
	private String name = "";
	private int age;
	
	
	// The next thing we learned about was the constructor -> the function we call to set up
	// each individual instance of our class:
	
	// This can be overloaded based on the amount of input variables and the datatypes of those variables:
	public Person() {}
	
	
	// Official constructor for the person class:
	// The input arguments of the constructor are LOCAL VARIABLES -
	// they only have scope inside of the Person(String, int) constructor.
	// Said otherwise, they ONLY REFER TO THE VALUE PASSED INTO
	// THE CONSTRUCTOR (they are NOT the instance variable of the class)
	public Person(String name, int age) {
		// If you want to reference an instance variable of the class,
		// you can use the this keyword:
		
		// Setting the instance variable 'name' to the same value
		// as the local variable 'name'
		this.name = name;
		this.age = age;
	}
	
	
	
	// Instead of giving direct read/write access to fields/instance variables, we can create methods that
	// return the values we want the user to be able to read (getters):
	// Notice we do not include the 'static' keyword here. This is because each instance of a Person must have
	// their own UNIQUE name returned. Therefore we cannot have all Persons share the same getName function.
	public String getName() {
		return this.name;
	}
	protected int getAge() {
		return this.age;
	}
	
	// This is a function responsible for changing the value of 
	// an instance variable
	public void setName(String newName) {
		this.name = newName;
	}
	
	
	// Static Method example:
	
	public static boolean compareNameLength(Person p1, Person p2) {
		// Storing the length of person1's name:
		int personOneLength = p1.getName().length();
	
		// Do the same with person2:
		int personTwoLength = p2.getName().length();
		
		if(personOneLength > personTwoLength) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// Let's say that the average person can calculate averages
	// Let's also say that we don't want just any user to be
	// able to call this static helper method. Instead, we want
	// only classes that inherit from Person to be able to call it
	// For this, we can use the 'protected' access modifier.
	// The protected access modifier ensures that a method/instance
	// variable is only accessible in the same package and
	// in subclasses (e.g. Student)
	protected static double calculateAverage(ArrayList<Double> nums) {
		double sum = 0;
		// Enhanced for loop:
		for (Double num : nums) {
			sum += num;
		}
		return sum / nums.size();
	}
	
	
	
	
	
	
	
	
}
