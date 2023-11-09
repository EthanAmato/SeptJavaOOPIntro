package com.tts.day3.relations;

public class CarDemo {

	public static void main(String[] args) {
		
		// Can access the individual values associated
		// with an enum using dot notation:
		Car myCar = new Car(CarType.SPORT, "Flat Engine", 6, 10);

		myCar.startEngine();
		
		// remove the reference to myCar
		myCar = null;
		//myCar.startEngine(); // (Causes Error) Engine object deleted with Car
	}

}
