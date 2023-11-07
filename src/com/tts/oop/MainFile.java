package com.tts.oop;

// To import a class from the JRE System Library, we need
// the package that it exists in along with the name of the class
// we will import:
import java.util.ArrayList;
import com.tts.oop.Car;
import com.tts.access.Employee;
import com.tts.day2.Person;
import com.tts.day2.Student;
public class MainFile {

//	Since this is a main file, we need to define a Main Method -
	// this is the function that will actually run code for our application

	public static void main(String[] args) {
		System.out.println("Hello, World");
		// Now that we have imported an ArrayList from java.util,
		// we are able to instantiate our very own ArrayList Object:
		ArrayList<Integer> favoriteNumbers = new ArrayList<Integer>();
		favoriteNumbers.add(82);
		favoriteNumbers.add(101);
		favoriteNumbers.add(31);
		
		System.out.println(favoriteNumbers);
		
		// Let's try making our very own Car instance:
		// This will call the no-args constructor because
		// we do not provide any args
		Car myCar = new Car();
		// Directly accessing the color instance variable on myCar (which we set to "Blue")
		// via dot notation. We can only do this because it has the 'public' access modifier
		System.out.println(myCar.color);
		
		// Thanks to the public access modifier on color, we can also set the value to another string:
//		myCar.color = "Beige";
		myCar.model = "Subaru";
		System.out.println(myCar.color);
		
		myCar.start();
		myCar.drive();
		myCar.stop();
		
		// This will call the constructor with 2 Strings
		// because we provide 2 strings as args inside
		// of Car()
		Car mySecondCar = new Car("Red", "Ferrari");
		System.out.println(mySecondCar.color);

		mySecondCar.start();
		
		// We are now going to import in a class
		// from another package. This means that 
		// we will actually need to use an import statement
		
		Employee myEmployee = new Employee("Ethan", 123);
		
//		myEmployee.name;
		// When our instance variables are 'public'
		// we can access them directly like the following:
//		System.out.println(myEmployee.name);
//		System.out.println(myEmployee.id);
		
		// Java uses 'access modifiers' like public, private, protected,
		// and default to incorporate encapsulation into classes: the ability
		// limit access to values / functions.
		
		// public -> accessible by anywhere
		// private -> When we are in a file that is NOT
		// 			  where an instance variable is defined,
		//			  that instance variable is not able to be
		//			  referenced or set directly
		// (none aka default or package visibility) -> Only other members
		//			  of the same package can access this directly, but other
		//			  members in other packages can't.
		// 	
		// protected -> Available to members of the same package (like default), but also
		//				able to be directly accessed by a class that inherits from it.
		//
		
		
		
		// Calling a getter to safely read the value of the name instance
		// variable on our myEmployee object 
		System.out.println(myEmployee.getName());
		System.out.println(myEmployee.getId());
		
		Employee mySecondEmployee = new Employee("Delvon", 100000);
		System.out.println(mySecondEmployee.getId());
		// We can now change the value via setter which
		// runs a check to see if it's a valid id:
		mySecondEmployee.setId(4321);
		
		System.out.println(mySecondEmployee.getId());
		
		// Static variables make it so that we can access a 
		// value or a method WITHOUT an individual instance
		// of that class. We can call it at the class level
		// like so:
		myEmployee.setStatus(Employee.STATUS_CLOCKED_IN);
		mySecondEmployee.setStatus(Employee.STATUS_CLOCKED_IN);
		
		
		// A Static Method, similar to a static variable,
		// can be run at the class level as well - we DO NOT
		// NEED an instance of a variable to run a static method
		
		Employee.compareEmployeeStatus(myEmployee, mySecondEmployee);
		
		
		System.out.println(myEmployee);
		System.out.println(mySecondEmployee);

		
		// Let's make a new example in the form of a Person object
		Person nullPerson = new Person();
		
		// Remember that the private access modifier restricts direct access to fields in our class
		// and keeps the user from reading/writing to it. This is a way we can implement encapsulation into our programs
		// int age = nullPerson.age;
		
		System.out.println(nullPerson.getName().length());
		
		Person genericGuy = new Person("John Smith", 50);
		
		System.out.println(genericGuy.getName());
		
		genericGuy.setName("Cool McCoolGuy");
		
		System.out.println(genericGuy.getName());
		
		System.out.println(Person.compareNameLength(genericGuy, nullPerson));
	
		ArrayList<Double> grades = new ArrayList<Double>();
		grades.add(90.23);
		grades.add(79.23);
		grades.add(60.23);
		grades.add(100.0);
		
		// Can't call this because calculateAverage is protected
		// and only accessible by classes in same package
		// or classes that inherit from Person
//		System.out.println(Person.calculateAverage(grades));
		
		
		Student myStudent = new Student("Alvin", 24, "Mathematics", grades);
		
		System.out.println(myStudent.getMajor());
		System.out.println(myStudent.getGrades());
		System.out.println(myStudent.getName());
		myStudent.setName("Shu Wai");
		System.out.println(myStudent.getName());
		System.out.println(myStudent.getGPA());
		
		
		System.out.println(myStudent.toString());
		
	}

}
