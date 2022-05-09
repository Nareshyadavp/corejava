package com.classelements.methods;

public class TestExample_8 {  // To represent instance variable by using this keyword
int a=10;
int b=20;   // instance variable
	
	void add(int a,int b) // local variable
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);  // by using this keyword

	}
	public static void main(String[] args) {
		TestExample_8 example_8=new TestExample_8();
		example_8.add(100, 200);
	}

}
