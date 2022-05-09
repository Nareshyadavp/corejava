package com.inheritance.assignment_constructors;

//case-2 Constructor call must be the first statement in a constructor
class Parent1{
	Parent1(){
		System.out.println("parent class 0-arg constructor");
	}
}
public class Child1 extends Parent1{
	Child1()
	{ 
		this(10); // calling child cls 1 arg con
		System.out.println("child class 0-arg constructor");
	}
	Child1(int a)
	{
		
		System.out.println("child class 1-arg constructor");
		
		// inside the constructor this and super keys must first statement
		//super();  //calling parent cls con  
	}
	public static void main(String[] args) {
new Child1();
	}

}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//Constructor call must be the first statement in a constructor