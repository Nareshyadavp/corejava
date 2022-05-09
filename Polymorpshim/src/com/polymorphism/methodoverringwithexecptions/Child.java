package com.polymorphism.methodoverringwithexecptions;

class Parent  {
	int marry()   throws ArithmeticException
	{
		System.out.println("block colour");
		return 10;

	}
}

public class Child extends Parent {
	//int marry() throws  InterruptedException
	{
		System.out.println("red colour");
		//return 20;
	}

	public static void main(String[] args) {
	Child c=new Child();
	c.marry();
	}
}

// child class method throws any checked Exception contains then parent class method must be throws same exceptions
//unchecked there is no restriction