package com.abstractelements.constructors;

// abtract class constains constractor
abstract class Parent {
	Parent(){
		System.out.println("0-arg cons of parent");
	}
	Parent(int a){
		System.out.println("1-arg cons of parent");
	}
	 abstract void m1();
	 void m2(int a,int b) {
		 System.out.println(a);
		 System.out.println(b);

		 }
}
public class Child extends Parent{

	Child(){
	System.out.println("0-arg cons of child");
}

	Child(int a){super(a);
	System.out.println("1-arg cons of child");
}


	
void m1() {
	System.out.println("m1 method"); //implementation of m1
	
}
void m2() {
	
	System.out.println( "child m2 method ");
	System.out.println(10);
	System.out.println(20);
}
public static void main(String[] args) {
 	Parent c1=new Child(10);
 	c1.m1();
 c1.m2(20, 10);
	}
 

}
