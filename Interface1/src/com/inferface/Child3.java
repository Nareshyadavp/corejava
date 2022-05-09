package com.inferface;


// step by step implements
interface It1{   // abstract
	void m1();  // public abstract
	void m2();  // public abstract
	void m3();  // public abstract
	

}

abstract class Child1 implements It1{
	public void m1() {
		System.out.println("m1 method implements");
	}
}

abstract class Child2 extends  Child1{
	public void m2() {
		System.out.println("m2 method implements");
	}
}

public class Child3  extends Child2{
	public void m3() {
		System.out.println("m3 method implements");
	}

	public static void main(String[] args) {
		Child3 c3=new Child3();
		c3.m1();
		c3.m2();
		c3.m3();
	}

}
