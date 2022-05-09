package com.classelements.methods;

public class TestExample_14 {  //case-1 passing variable
int a=100;  // instance variable
int m1(int a) { //local variable
	System.out.println("m1 method");
	return a;//  return local variable priority 
}
	public static void main(String[] args) {
		TestExample_14 example_14=new TestExample_14();
		 int i=example_14.m1(10);
		 System.out.println("method return value ="+i);
	}

}
