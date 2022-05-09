package com.abstractelements.instenceblock;


// instancebloks are contains the abtract class
abstract class Parent{
	Parent(int a){
		System.out.println("1-arg constructor of parent");
	}
	{
		System.out.println("abstract instanceblock of parent");
	}
	abstract void m1();
}
public class Child extends Parent{
	 

	Child(int a) {
		super(a);
		System.out.println("1-arg constructor of child");

	}
	{
		System.out.println("abstract instanceblock of child");
	}
void m1() {
	System.out.println("m1 method of child");
}
	public static void main(String[] args) {
 		new Child(10).m1();

	}

}
