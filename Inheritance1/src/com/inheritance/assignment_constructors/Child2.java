package com.inheritance.assignment_constructors;
//case-3 this and super keys both at a time not possible
class Parent2{
	Parent2(){
		System.out.println("parent class 0-arg constructor");
	}
}
public class Child2 extends Parent2{
	Child2()
	{ 
		
		// both are  at a time not possible 
		this(10); // calling child cls 1 arg con
		//super();  //calling parent cls con  

		System.out.println("child class 0-arg constructor");
	}
	Child2(int a)
	{
		
		System.out.println("child class 1-arg constructor");
		
		// inside the constructor this and super keys must first statement
		//super();  //calling parent cls con  
	}
	public static void main(String[] args) {
new Child2();
	}

}
