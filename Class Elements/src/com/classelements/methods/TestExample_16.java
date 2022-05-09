package com.classelements.methods;

public class TestExample_16 {  ////case-3 passing variable by using this keyword

	int a=100;  // instance variable
	int m1(int a) { //local variable
		System.out.println("m1 method");
		return this.a;//  return instance variable priority by using this keyword 
	}
		public static void main(String[] args) {
			TestExample_16 example_16=new TestExample_16();
			 int i=example_16.m1(10);
			 System.out.println("method return value ="+i);
		}

}
