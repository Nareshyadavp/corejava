package com.polymorphism.methodoverring;

//Rule-4 final method not possible to overriding the child class methodclass

//case-2 Instancevariable

public final class InstanceVariable {
int a=10; // we can reassign variables bcz of we didnot declare final modifier
void m1() { // default final method 
	System.out.println(	a=a+10);
}
	public static void main(String[] args) {
new InstanceVariable().m1();
	}

}
//if method is not final then we will override the that method of child class here class
//declare final so we cannot inheritance to child class 
// so we declared fial class  method also final.but not variables