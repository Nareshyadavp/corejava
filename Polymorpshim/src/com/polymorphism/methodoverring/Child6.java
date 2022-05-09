package com.polymorphism.methodoverring;

//Rule-6 it is not possible to override the declaed private 

class Paret6{
 private  void m1() {  // overriden 
		System.out.println("private parent m1 method");
	}
}
public class Child6 extends  Paret6{  // overring is not possible 
	  void m1() {  // overriden 
			System.out.println("private child m1 method");
		}
	public static void main(String[] args) {
Child6 c=new Child6();
c.m1();// not visible
Paret6 p=new Paret6();
 //p.m1();// not visible
	}

}
