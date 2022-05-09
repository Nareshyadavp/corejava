package com.abstrac;

public abstract class Bike {
	public abstract void run();
}

class Honda extends Bike {
	public void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Bike bike = new Honda();
		bike.run();
	}
}

//A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).