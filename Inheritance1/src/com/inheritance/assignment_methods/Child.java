package com.inheritance.assignment_methods;


class Parent {
	void m1() {
		System.out.println("parent m1 method");
	}
}
public class Child extends Parent {
	void m1() {
		System.out.println("child m2 method");
	}
void m2() {
	 this.m1();  //  child this is optional
	 super.m1();   // parent
}
	public static void main(String[] args) {
new Child().m2();
	}

}
