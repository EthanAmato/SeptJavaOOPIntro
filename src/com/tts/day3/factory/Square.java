package com.tts.day3.factory;

public class Square implements Shape {

	@Override
	public void draw() {
		int height = 5;
		int width = 5;

		for (int h = 1; h <= height; h++) {
			for (int w = 1; w <= width; w++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
