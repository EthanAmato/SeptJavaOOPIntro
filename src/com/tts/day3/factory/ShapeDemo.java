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
		
		// 3. Single Responsibility Principle -> Factories centralize the creation logic for our shape 
		// objects, meaning that the factory class is solely responsible for the lifecycle of these objects.
		
		// 4. Ease of configuration -> Factories can be designed to create objects based on different parameters
		// i.e. we could theoretically overload our getShape method to include radius or width/height.
		
		
		ShapeFactory shapeFactory = new ShapeFactory();
		 
		Shape myFactoryMadeCircle = shapeFactory.getShape(ShapeType.CIRCLE);
		myFactoryMadeCircle.draw();
		
		Shape myFactoryMadeSquare = shapeFactory.getShape(ShapeType.SQUARE);
		myFactoryMadeSquare.draw();		
		
		// Not allowed because we didn't add TRIANGLE to our Enum - therefore
		// users cannot even try to ask for the creation of a triangle from
		// our shapeFactory
		// Shape myFactoryMadeTriangle = shapeFactory.getShape(ShapeType.TRIANGLE);
	}
}
