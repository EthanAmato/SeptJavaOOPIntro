package com.tts.day3;

// This is a CLASS that will act as a way to instantiate Cat objects
// it will CONCRETE methods and instance variables that will (eventually)
// be enforced by an interface

// to 'connect' an interface and a class, we will use the 'implements' keyword
public class Cat implements Animal {

	private String name;
	private Integer age;
	private String breed;
	
	public Cat(String name, Integer age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void makeSound() {
		System.out.printf("%s the %s cat meows...\n", this.name, this.breed);
	}
	
	
	@Override
	public void chooseFood() {
		System.out.printf("%s the %s cat finds a mouse...\n", this.name, this.breed);
	}
	
	
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	
	
}
