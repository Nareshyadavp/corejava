package com.inheritance.hierarchicalinheritance;

public class Animal {
	public void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("barking");
	}
}

class Cat extends Animal {
	public void meow() {
		System.out.println("meowing");
	}

}
