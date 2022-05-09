package com.classelements.methods;

public class TestExample_1 {  // without parameters

	void m1() // instance method
	{
		System.out.println("m1 method");
	}

	static void m2() // static method
	{
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		TestExample_1 test = new TestExample_1();
		test.m1();
		TestExample_1.m2();
		test.m2();  //
	}

}
