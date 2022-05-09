package com.inheritance.assignment_variables;

class Parent2 {    //priority of the insatnce variable & super class variable
	int a=10;
	int b=20;
	
}
public class Child2 extends Parent2{
int a=100;
int b=200;
void add(int a,int b)//local variable
{
	System.out.println(a+b);  // local
	System.out.println(this.a+this.b);  // cureent 
	System.out.println(super.a+super.b);  // parent {super}
	}
	public static void main(String[] args) {
		new  Child2().add(1000, 2000);		

	}

}