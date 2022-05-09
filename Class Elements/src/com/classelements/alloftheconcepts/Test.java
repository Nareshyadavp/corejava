package com.classelements.alloftheconcepts;

public class Test {
	int c=30;
	int a=10; // Declared instance variable
	static int b=20; // Declared static variable

	void m1(int a) //instance method
	{
		System.out.println("instance method");  // insatnce area
	}
	static void m2(String str) // static method
	{
		System.out.println("static method");  // static area
	}
	
	Test ()   //default constructor
	{
		System.out.println("0-org constructor");
	}
Test (int a)   //user defind constructor
{
	System.out.println("1-org constructor");    

	} 
// instance block
{
	System.out.println("instance block");
}
// static block
static  
{
	System.out.println("static block");

}
	public static void main(String[] args) {
Test t=new Test(); // static-ins-cons
Test t1=new Test(10);// ins-cons
System.out.println(t.a);
System.out.println(t.c);
System.out.println(t1.a);
System.out.println(t1.c);
t.m1(111);// m1()
t1.m2("nanna");//m2()

System.out.println(t.b);
System.out.println(t1.b);
t.b=30;
t1.a=30;
System.out.println(t.b);
System.out.println(t1.b);
System.out.println(t1.a);  
System.out.println(t.a);

	}

}
