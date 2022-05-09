package com.polymorphism.methodoverring;

// //Rule -3 return type must be same at the classlevel

class Animal{
	
}

class Dog  extends Animal{
	
}

class Parent2{
	Animal marry() {
	 System.out.println("block colour");
	 Animal a=new Animal();
	return a;
 	}
}
public class Child2 {
	Dog marry() {

	 System.out.println("red colour");
	 Dog d=new Dog();
	 return d;
	}

	public static void main(String[] args) {
		new Child2().marry();

	}

}
