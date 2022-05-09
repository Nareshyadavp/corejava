package com.abstractelements.assaignment_1;
class Emp{}
class Student{}
class Cat{}
class Dog{}

abstract class Parent{
	abstract String m1(Emp e,int a);
	abstract int m2(char ch,float f);
	abstract Student m3(Cat c,Dog d);
	
}
abstract class Child1 extends Parent {
	String m1(Emp e,int a) {
 		System.out.println("m1 method");
 		System.out.println(e+"-------"+a);
 		return "rathan";
 		
	}
}
public class Child2 extends Child1{
int m2(char ch,float f) {
	System.out.println("m2 method");
	System.out.println(ch+"---"+f);
	return 10;
}
	Student m3(Cat c,Dog d){
		System.out.println("m3 method");
		System.out.println(c+"--"+d);
		return new Student();
	}

	public static void main(String[] args) {
Child2 c=new Child2();
 String str=c.m1(new Emp(), 10);
 System.out.println("m1 method return values="+str);
int x= c.m2('c', 10.5f);
System.out.println("m2 method return values="+x);
Student s=c.m3(new Cat(),new Dog());
 System.out.println("m3 method return values="+s);
 
	}

}
