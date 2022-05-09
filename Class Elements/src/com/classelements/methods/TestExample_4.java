package com.classelements.methods;

public class TestExample_4
{
//	void m1() // instance method
	{
		System.out.println("m1 method");
	}

	static void m1() // static method
	{
		System.out.println("m2 method");
	}


	public static void main(String[] args) {
		
		TestExample_4 example_4=new TestExample_4();
		example_4.m1();
 
	}

}
   // m1() is already defined in the  class TestExample_4 