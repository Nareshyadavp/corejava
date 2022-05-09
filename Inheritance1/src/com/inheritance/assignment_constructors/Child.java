package com.inheritance.assignment_constructors;

//case-1 calling this and super keys
class Parent{
	Parent(){
		System.out.println("parent class 0-arg constructor");
	}
}
public class Child extends Parent{
	Child()
	{ 
		this(10); // calling child cls 1 arg con
		System.out.println("child class 0-arg constructor");
	}
	Child(int a)
	{
		super();  //calling parent cls con
		System.out.println("child class 1-arg constructor");

	}
	public static void main(String[] args) {
new Child();
	}

}
