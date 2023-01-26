package com.lcpan.m06p;

public class Test1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.run();
		Dog dog = new Dog();
		dog.run();
		animal = dog;
		animal.run();
		//animal.bark();  //會出現error 因為animal裡面沒有bark這個方法
		animal = new Cat();
		animal.run();
		animal = new Lion();
		animal.run();
		//animal.roar();  //會出現error 因為animal裡面沒有roar這個方法
		Feline feline = new Lion();
		feline.run();
	}

}
