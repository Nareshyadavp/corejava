package com.inheritance.assignment_instanceblock;
// Instance block During object creation
class Parent{
	{
		System.out.println("parent instance block");
	}
}
public class Child {

	{
		System.out.println("child instance block");
	}
	public static void main(String[] args) {
new Child();
new Child();//  During object creation
// without object creation we can not executed
	}

}
