package com.classelements.variables;

public class Assigenment1 
{

	int a = 200; 
	int b = 300;   // declared instance variables

	static void m1() // static method
	{
		Assigenment1 assigenment1 = new Assigenment1();  //creating object  because of its static area

		System.out.println(assigenment1.a);
		System.out.println(assigenment1.b);  	
		} // method is completed ,object is destroyed

	static void m2() {
		Assigenment1 assigenment1 = new Assigenment1(); // must create object
		System.out.println(assigenment1.a);
		System.out.println(assigenment1.b);   // static area

	}

	public static void main(String[] args) {
		Assigenment1.m1();  // calling class-name m1()
		Assigenment1.m2();  // calling  class-name  m2()

	}

}
