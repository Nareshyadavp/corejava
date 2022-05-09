package com.abstractelements.assaignment;


abstract class Parent{
	float f=30f;
	Parent(int a,int b){
		System.out.println("1-arg cons of abstract");
	}
	
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");

	}
	abstract void m1();
	
}
public class Child extends Parent {
	Child(int a,int b){
		super(a, b);
		System.out.println("1-arg cons of static block");
	}
	{
		System.out.println("instance block of static");
	}
	static {
		System.out.println("static block of static");

	}
	void m1() {
		System.out.println("implementation of the m1 method");
	}
	
	public static void main(String[] args) {
		Child s=new Child(10,20);
		s.m1();
		System.out.println(s.f);
	}

}
