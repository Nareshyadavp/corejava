package com.inheritance.assignment_variables;


class Parent1 {    //priority of the local variable
	int a=10;
	int b=20;
	
}
public class Child1 extends Parent1{
int a=100;
int b=200;
void add(int a,int b)//local variable
{
	System.out.println(a+b);  // local
	System.out.println(a+b);  // cureent 
	System.out.println(a+b);  // parent {super}
	}
	public static void main(String[] args) {
		new  Child1().add(1000, 2000);		

	}

}

