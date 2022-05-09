package com.classelements.methods;

public class TestExample_15 { //case-2 passing variable

	int a=100;  // instance variable
	int m1() { // no local variable
		System.out.println("m1 method");
		return a;//  return   instance variable priority 
	}
		public static void main(String[] args) {
			TestExample_15 example_15=new TestExample_15();
			 int i=example_15.m1();
			 System.out.println("method return value ="+i);
		}
}
