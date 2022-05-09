package com.classelements.methods;

public class TestExample_13 {   // way of the return the current class object 
	TestExample_13 m1(){
		System.out.println("m1 method");
		TestExample_13 t=new TestExample_13();
		return t; // Approach-1 return new TestExample_13();
		
	}
	TestExample_13 m2(){
		System.out.println("m2 method");
		return this; //Approach-2  using thiskeyword return type
		
	}

	public static void main(String[] args) {
		TestExample_13  example_13=new TestExample_13();
		TestExample_13 t1=	example_13.m1();
		TestExample_13 t2=	example_13.m2();

		
	}

}
