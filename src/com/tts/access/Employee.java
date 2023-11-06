package com.tts.access;

import com.tts.oop.Car;

/**
 * The Employee class represents an employee with a name and and ID
 */
public class Employee {
	// Let's define a Constant inside of our Employee:
	// A constant is a variable typically shared by all instances of a Class
	// (meaning it exists at the class level)
	// that CANNOT BE CHANGED!!!!!! We can tell Java to make a value unchangeable by
	// using the 'final' keyword
	// and we can tell Java to make a value / method shared by using the 'static'
	// keyword. Therefore, a common
	// way of defining constants looks like the following:

	// This is an Integer that represents the upper limit of Employee IDs
	public static final Integer MAX_ID = 9999;

	// Next, we can make our instance variables:
	private String name;
	private Integer id;

	// Constructor:
	public Employee(String name, Integer id) {
		if (id < MAX_ID) {
			this.name = name;
			this.id = id;
		} else {
			this.name = name;
			System.out.println("id was too big... Setting it to null.");
		}
	}

	// To allow for read-only access in a Java class,
	// we can create a function called a 'getter' - a
	// simple method that only returns the current value
	// of an instance variable. Since we are inside of the
	// class where name and id were defined, we are able to reference
	// them directly as though they were public (using dot notation)

	public String getName() {
		return this.name;
	}

	public Integer getId() {
		return this.id;
	}

	// But sometimes, we want to give access to overwriting
	// certain instance variables. Let's say a user accidentally
	// put in a value that was too big for id (>9999). They would need
	// some way to update the value of that id. To address this, we can
	// make a method called a 'setter' which is responsible for changing the
	// value of an instance variable. Having setters as an intermediary allows
	// for extra logic checks and flexibility in writing classes:

	public void setId(Integer newId) {

		if (newId < MAX_ID) {
			this.id = newId;
			return;
		}

		System.out.println("Invalid Id");

	}
	


}
