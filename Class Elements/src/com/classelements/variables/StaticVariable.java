package com.classelements.variables;

public class StaticVariable {
	static	int a = 10;
	static	int b = 20;
	static	float f = 30.f; // Declared the  static modifier into the Inside class and outside of the method

	public static void main(String[] args) // main method   // static method
	{
	
System.out.println(StaticVariable.a);
System.out.println(StaticVariable.b);   // Accessing by class-name
System.out.println(StaticVariable.f);   // static area
StaticVariable staticVariable=new StaticVariable();   //object creating
staticVariable.m1();  // through  ObjectRef variable inside the main method because of must call the m1()

	}
void m1()   // instance method
{
	
System.out.println(StaticVariable.a);
System.out.println(StaticVariable.b);   // Accessing by class-name
System.out.println(StaticVariable.f);   // instance area

}
}

//static  variables memory allocated class loading time .Accessing  by usin the the class-name