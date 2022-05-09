package com.inheritance.assignment_staticblock;

//static block During class-name  
class Parent{
	static {
		System.out.println("parent static block");
	}
}
public class Child {
static 
	{
		System.out.println("child static block");
	}
	public static void main(String[] args) {
		new Child();
	}

}
