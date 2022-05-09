package com.inheritance.assignment_variables;



class Parent {
	int a=10;
	int b=20;
	
}
public class Child extends Parent{
int c=100;
int d=200;
void add(int x,int y)
{
	System.out.println(x+y);  // local
	System.out.println(c+d);  // cureent 
	System.out.println(a+b);  // parent {super}
	}
	public static void main(String[] args) {
		new  Child().add(1000, 2000);		  

	}

}
