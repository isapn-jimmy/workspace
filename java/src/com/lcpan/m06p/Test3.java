package com.lcpan.m06p;

public class Test3 {

	public static void main(String[] args) {
		Animal animal = new Dog();
	//	animal.bark();  //error，因為Animal 裡沒有 bark ()  這個方法
		Dog dog = (Dog)animal;
		dog.bark();
		if (animal instanceof Dog) {
			System.out.println("Animal is a dog");
		}
	}

}
