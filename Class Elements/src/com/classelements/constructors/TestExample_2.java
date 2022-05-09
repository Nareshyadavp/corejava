package com.classelements.constructors;

public class TestExample_2 {
	void m1(){
		System.out.println("m1 method");
	}
	// user Defined constructor
	TestExample_2(){
		System.out.println("0-arg constructor");

	}
	TestExample_2(int a){
		System.out.println("1-arg constructor");

	}
	
	public static void main(String[] args) {
		TestExample_2 example_2=new TestExample_2();
		example_2.m1();
		TestExample_2 example_22=new TestExample_2(10);
		example_22.m1();
	}

}
