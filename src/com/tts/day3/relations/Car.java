package com.tts.day3.relations;

public class Car {

	// We are able to treat our Enums as a datatype (meaning carType can only be
	// SEDAN, SUV, or SPORT)
	private CarType carType;

	// This is going to be an example of composition inside of a Java class.
	// Composition is where the lifecycle of one object (in this case Engine) is
	// completely
	// reliant on the lifecycle of another object (Car)
	// So if the Car is deleted, its engine will also cease to be.

	// Due to this unique relationship where one class relies on another, we
	// typically
	// will write the 'relying' class (Engine) inside of a 'nested class'
	private Engine engine;

	public Car(CarType carType, String model, Integer cylinders, Integer power) {
		this.carType = carType;
		
		// This Engine object is literally constructed inside of the Car constructor - this means
		// that if the car is deleted, there is no way for the Engine to exist outside of the Car and
		// it will therefore be deleted alongside the Car object (the hallmark of composition)
		this.engine = new Engine(model, cylinders, power);
	}
	
	public void startEngine() {
		if(engine != null) {
			engine.start();
		}
	}
	
	

	// define a private nested class for Engine
	// Remember, the private keyword means that this Engine class is ONLY ACCESSIBLE
	// inside of Car.java
	private class Engine {
		private String model;
		private Integer cylinders;
		private Integer power;

		public Engine(String model, Integer cylinders, Integer power) {
			this.model = model;
			this.cylinders = cylinders;
			this.power = power;
		}

		public void start() {
			System.out.printf("%s uses its %d cylinders to let out %d power\n", this.model, this.cylinders,
					this.power);
		}

	}

}
