package com.package1;

public class A {
	public void m1() {
		System.out.println("null");
	}
	public void m1(int i) {
		System.out.println(1);
	}
	public void m1(String s) {
		System.out.println("name");
	}
	
	
	
	public static void main(String[] args) {
 A a=new A();
		a.m1();
 a.m1(1);
 a.m1("naresh");

	}

}
