package com.tts.day3.factory;

public class ShapeDemo {

	public static void main(String[] args) {
		Square mySquare = new Square();
		mySquare.draw();
		
		Rectangle myRectangle = new Rectangle();
		myRectangle.draw();
		
		Circle myCircle = new Circle();
		myCircle.draw();
		
		// Factories have the following benefits:
		// 1. Abstracted away the creation logic - we don't
		// need to know how to creat our Shapes, we just need to call
		// a method
		
		// 2. Allows for the decoupling of client code (ShapeDemo) from concrete classes -> factories lead to loose coupling.
		// This means that changes to the creation logic (ShapeFactory.getShape()) or the concrete 
		// classes (Square, Circle, Rectangle) DO NOT AFFECT client code
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape myFactoryMadeCircle = shapeFactory.getShape(ShapeType.CIRCLE);
		myFactoryMadeCircle.draw();
		
		Shape myFactoryMadeSquare = shapeFactory.getShape(ShapeType.SQUARE);
		myFactoryMadeSquare.draw();
	}
}
