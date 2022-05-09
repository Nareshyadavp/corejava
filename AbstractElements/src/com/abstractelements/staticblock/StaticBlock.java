package com.abstractelements.staticblock;

// abstarct class contains static and variables along with methods  are applicable
abstract class Parent11{
	float f=30f;
	Parent11(int a,int b){
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
public class StaticBlock extends Parent11 {
	StaticBlock(int a,int b){
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
		StaticBlock s=	new StaticBlock(10,20);
		s.m1();
		System.out.println(s.f);
	}

}
