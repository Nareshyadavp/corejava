package com.inheritance.singleinheritance;

//the one class inheritance the another class
public class Animal {

	public void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("barking");
	
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();

	}

}
