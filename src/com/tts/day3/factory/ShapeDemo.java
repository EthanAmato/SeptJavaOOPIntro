package com.tts.day3.factory;

public class ShapeDemo {

	public static void main(String[] args) {
		Square mySquare = new Square();
		mySquare.draw();
		
		Rectangle myRectangle = new Rectangle();
		myRectangle.draw();
		
		Circle myCircle = new Circle();
		myCircle.draw();
	}
}
