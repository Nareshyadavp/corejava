package com.abstractelements.methods;

abstract class Parent{
	abstract  void m1();  // abstract method
	abstract  void m2();  // abstract method
	abstract  void m3();  // abstract method
}
public class Child extends Parent {
void m1() {
	System.out.println("m1 implementation");// implementation method1
}
void m2() {
	System.out.println("m2 implementation");// implementation method2
}
void m3() {
	System.out.println("m3 implementation");// implementation method3
}
void m4() {
	System.out.println("m4 implementation");// direct  method4
}
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}

}
