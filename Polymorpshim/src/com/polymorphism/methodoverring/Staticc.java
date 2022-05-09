package com.polymorphism.methodoverring;

//Rule-5 method hiding
//5 it is  not possible to override staticmethod,its always bonding with class-name;
class Parent5 {
	static void m1()  // overriden method  // method hinding
	{
		System.out.println("parent m1 static method"); 
	}
}
public class Staticc extends Parent5 {
	
	static void m1() // overriding method
	{
		System.out.println("saticvariable  m1 method");
	}
	public static void main(String[] args) {
		Parent5 p=new Staticc();
		p.m1(); //bound with class-name
}

}
