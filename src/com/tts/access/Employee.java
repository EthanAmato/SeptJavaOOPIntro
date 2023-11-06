package com.tts.access;

import com.tts.oop.Car;

/**
 * The Employee class represents an employee with a name and and ID
 * 
 * Follows the conventions in Java of the order to define parts of a class: 1.
 * Constants 2. Instance Variables 3. Constructor(s) 4. Methods
 * 
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
	private static final Integer MAX_ID = 9999;

	// Static constants that are public:
	public static final String STATUS_CLOCKED_IN = "Clocked In";
	public static final String STATUS_CLOCKED_OUT = "Clocked Out";

	// Next, we can make our instance variables:
	private String name;
	private Integer id;
	private String status;

	// Constructor:
	public Employee(String name, Integer id) {
		if (id < MAX_ID) {
			this.name = name;
			this.id = id;
		} else {
			this.name = name;
			System.out.println("id was too big... Setting it to null.");
		}

		this.status = this.STATUS_CLOCKED_IN;

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

	public String getStatus() {
		return this.status;
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

//	At the bottom here, let's have one more setter for changing the status of our Employee
	// The user will be able to access the value associated with STATUS_CLOCKED_IN +
	// OUT at the class
	// level as input:

	public void setStatus(String newStatus) {
		System.out.println(newStatus);
		if (isValidStatus(newStatus)) {
			this.status = newStatus;
			return;
		}
		System.out.println("Invalid status...");
	}

	// Let's create a static method - a method that is run at the class level. You
	// do not need an instance
	// to run a static method. This can be outward-facing methods that are used by
	// developers or
	// private utility methods to help you with the underlying logic of your class

	// This is an example of a static helper/utility function. We don't need it to
	// be tied to
	// any individual instance.
	private static boolean isValidStatus(String status) {
		if (status.equals(STATUS_CLOCKED_IN) || status.equals(STATUS_CLOCKED_OUT)) {
			return true;
		}
		return false;
	}

	// An example of an outward facing static method could be a method that compares
	// the
	// status of two Employees:
	public static void compareEmployeeStatus(Employee e1, Employee e2) {
		if (e1.getStatus().equals(e2.getStatus())) {
			System.out.println("Both Employees have the same status: " + e1.getStatus());
		} else {
			System.out.println("The Employees have 2 different statuses.");
		}
	}

}
