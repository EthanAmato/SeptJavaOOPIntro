package com.tts.access;

import java.util.ArrayList;

import com.tts.day2.Person;

public class Test extends Person {
	public static void main(String[] args) {
		Employee newEmployee = new Employee("TEst", 123);
		System.out.println(newEmployee.name);
		
		ArrayList<Double> grades = new ArrayList<Double>();
		grades.add(90.23);
		grades.add(79.23);
		grades.add(60.23);
		grades.add(100.0);
		
		// Can access calculateAverage even though we are in
		// a separate package than Person because Test extends
		// Person (and the method is protected)
		Test.calculateAverage(grades);
		
	}
}
