package com.tts.day3;

// Dog will also implement the Animal interface, which will (just like Cat)
// enforce the presence of the makeSound() and chooseFood() methods, ensuring
// that there is standardization across classes that implement Animal while
// also allowing for polymorphism / custom implementations of the same method

public class Dog implements Animal {

	private String name;
	private Integer age;
	private String breed;
	
	public Dog(String name, Integer age, String breed) {
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
		System.out.printf("%s the %s dog woofs...\n", this.name, this.breed);
	}
	
	
	@Override
	public void chooseFood() {
		System.out.printf("%s the %s dog eats some kibble...\n", this.name, this.breed);
	}
	
	
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}
	
	
}
