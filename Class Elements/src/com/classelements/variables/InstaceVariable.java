package com.classelements.variables;

public class InstaceVariable {
	int a = 10;
	int b = 20;
	float f = 30.f; // Declared the Inside class and outside of the method

	public static void main(String[] args) // main method // static method
	{
		InstaceVariable instaceVariable = new InstaceVariable(); // object required different area

		System.out.println(instaceVariable.a);
		System.out.println(instaceVariable.b); // static area
		System.out.println(instaceVariable.f);
		instaceVariable.m1();  // through  ObjectRef variable inside the main method because of must call the m1()
	}

	void m1() // Instance method
	{
		System.out.println(a); // Instance Area
		System.out.println(b);
		System.out.println(f); // Direct Accessing

	}

}
// instance variables memory allocated the object creation time .Accessing  by usin the the object