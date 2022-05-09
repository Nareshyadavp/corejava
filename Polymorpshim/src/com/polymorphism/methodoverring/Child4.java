package com.polymorphism.methodoverring;


//Rule -5 parent class ref variable to child class object

class Parent4{
	void property()  //overriden method 
	{
		System.out.println("parent property method ");
	}
}
public class Child4 extends Parent4 {
	void property()  //overriding method
	{
		System.out.println("child property metho");
		}
void marry()  // direct method
{
	System.out.println("child marry method");
}
	public static void main(String[] args) {
		
Parent4 p=new Child4(); //object of child

p.property(); // compiler: parent method runtime:child obj

//p.marry(); // compiler: parent method runtime:child obj

// parent class does not contain marry method so overcome this problem by using typecasting
Child4 c= (Child4)p;
c.marry();
	}

}
