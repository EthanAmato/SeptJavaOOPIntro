package com.tts.day3.factory;

// This is a class that is responsible for creating Shape objects and returning them
// to the user. Factory classes do not typically make their own constructor, rather
// they will have a method on them that will 'create' or 'get' different objects
public class ShapeFactory {

	// We are able to actually use our Interfaces as a return type for our methods:
	// when we get an object back from the ShapeFactory getShape method, it will
	// just have
	// a .draw() method associated with it because that is what our Shape interface
	// enforces

	// This method takes in one of the shapetypes that we defined inside of our enum
	// (CIRCLE, SQUARE, RECTANGLE)
	public Shape getShape(ShapeType type) {
		if (type == null) {
			return null;
		}

		// Switch statement is responsible for doing a series of equivalence checks and
		// we
		// can even switch on Enums:
		switch (type) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		default:
			// In case the user manages to put in a value that is not in ShapeType (somehow),
			// we'll throw an IllegalArgumentException that will crash the program and notify
			// the user what went wrong
			throw new IllegalArgumentException("Shapetype not recognized...");
		}

	}

}
