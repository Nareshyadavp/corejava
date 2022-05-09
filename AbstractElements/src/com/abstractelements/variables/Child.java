package com.abstractelements.variables;
abstract class Pareant{
	abstract void m1();

}
public class Child extends Pareant {
	int a=10;
static char chr='a';
void m1() {
	System.out.println("m1 method is implements");
}
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
	System.out.println(	Child.chr);
	System.out.println(	c.a);

	}

}
