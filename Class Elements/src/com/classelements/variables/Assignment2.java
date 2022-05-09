package com.classelements.variables;

public class Assignment2 {

	int a = 100;
	int b = 200; //declared instance variables
	static int c = 300;
	static int d = 400;   // declared static variables

	void m1() // instance method
	{
		System.out.println(a);
		System.out.println(b); // directly access

		System.out.println(Assignment2.c);
		System.out.println(Assignment2.d); // calling by using class name

	}

	static void m2() // static method
	{
		Assignment2 assignment2 = new Assignment2();
		System.out.println(assignment2.a);
		System.out.println(assignment2.b); // instance area by using object creation

		System.out.println(Assignment2.c);
		System.out.println(Assignment2.d); // static area by using class name

	}

	public static void main(String[] args) {

		Assignment2 assignment2 = new Assignment2(); // instance method by using object creation
		assignment2.m1(); // instance method by using object creation
		Assignment2.m2(); // static method by using class-name

	}

}
