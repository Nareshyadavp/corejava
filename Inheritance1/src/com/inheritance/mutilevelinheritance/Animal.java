package com.inheritance.mutilevelinheritance;

public class Animal {
	Animal(){
		System.out.println("animal cons");
	}
	void eat() {
		System.out.println("Animal is eating");
	}
	
}

class Dog extends Animal {
	Dog(int a,int b){
		System.out.println("dog cons");
	}
	void bark() {
		System.out.println("Dog is barking");
	}
}

class BabyDog extends Dog {
	
	BabyDog(int a){
		super(10,20); 

		System.out.println("BabyDog cons");

	}
	void weep() {
		System.out.println("BabyDog is weeping");
	}
}
