package com.method;

public class Method {
public void m1() {
	System.out.println("Name");
}
public void marry() {
	System.out.println("sandeep");
}
class C extends Method{
	public void marry() {
		System.out.println("suri");
	}
}
 class Test {
	

	public static void main(String[] args) {
 Test t=new Test();
 C c=new C();
 c.m1();
	

}
}
