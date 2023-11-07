package com.tts.day2;

import java.util.ArrayList;

// We want to ensure that each instance of a Student class will come with
// all provided methods and instance variables associated with Persons. We
// can accomplish this in Java through the 'extends' keyword. The 'extends' keyword
// tells java that a class inherits from another class. You can only extend 1
// class per class

public class Student extends Person {

	private String major;
	private ArrayList<Double> grades;

	public Student(String name, int age, String major, ArrayList<Double> grades) {
		// To call the constructor of the superclass with input args,
		// we can use the 'super()' method inside of the Student constructor:

		// Takes name and age from input and sends it to the Person(String name, int
		// age)
		// constructor
		super(name, age);

		this.major = major;
		this.grades = grades;
	}

	public String getMajor() {
		return this.major;
	}

	// Can override methods passed down from superclasses via the @Override
	// annotation
	// This assists in Polymorphism - the ability to fine-tune inherited methods
	// based on
	// the specific use case of the class you are currently defining

//	@Override 
//	public String getName() {
//		return "Student";
//	}

	public ArrayList<Double> getGrades() {
		return this.grades;
	}

	public Double getGPA() {
		return Student.calculateAverage(grades);
	}

	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", age=" + this.getAge() + ", major=" + this.getMajor() + ", gpa="
				+ this.getGPA() + "]";
	}

}
