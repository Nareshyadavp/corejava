package com.package1;

public class A {
public void m1() {
	System.out.println("Craying 1");
}
class B extends A{
	public void m2() {
		System.out.println("Craying 2");
	}
}
class C extends A {
	public void m3() {
		System.out.println("Craying 3");
	}
}
	public static void main(String[] args) {
 A a=new A();
 a.m1();
 }
}

