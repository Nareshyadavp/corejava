package com.polymorphism.methodoverring;

// Rule-4 final method not possible to overriding the child class methodclass
class Parent3 {
	// overriden method
	final void marry() { // declared final
		System.out.println("block colour");
	}
}

public class Child3 extends Parent3 {
	// overring method
	// void marry() { //not possible to overriding
	// System.out.println("red colour");
	// }

	public static void main(String[] args) {
		new Child3().marry();

	}

}
