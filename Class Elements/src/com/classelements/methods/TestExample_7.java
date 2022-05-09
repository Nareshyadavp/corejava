package com.classelements.methods;

public class TestExample_7 {  // method calling

	
	void m1()
	{   m2();  // instance method calling  //m2-m1
		System.out.println("m1 method");
		m2();  // m3-m2
	}

	void m2() 
	{ m3(10);
		System.out.println("m2 method");
	}

	void m3(int a) {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		TestExample_7 example_7=new TestExample_7 ();
		example_7.m1();
	
	}

}
