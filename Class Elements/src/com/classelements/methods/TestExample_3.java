package com.classelements.methods;

class Emp{}

class X{}

class Y{}
class Student{}

public class TestExample_3 {  // method with excepting objects
	
	
	void m1(X x,Emp e) // instance method
	{
		System.out.println("m1 method");
	}

	static void m2(Y y,Student s) // static method
	{
		System.out.println("m2 method");
	}

	public static void main(String[] args) 
	{

		TestExample_3 example_3 =new  TestExample_3 (); // object creating
		X x=new X();
		Emp e =new Emp();
		example_3.m1( x, e);  // calling m1()
		
		//example_3.m1(new X(),new Emp());  // single line
		
		Y y=new Y();
		Student s=new Student();
		example_3.m2(y, s);   // calling m2()
		
		//example_3.m2(new Y(),new Student());  // single line
		
	}

}
