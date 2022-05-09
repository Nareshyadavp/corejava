package com.inheritance.multilevelinheritance;

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

class BabyDog extends Dog {
	public void weep() {
		System.out.println("weeping");
	}
}
