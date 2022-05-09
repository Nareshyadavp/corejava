package com.classelements.methods;

public class TestExample_2 {  // with  normal parameters
	
	
	void m1(int a,char ch) // instance method  //always method parameters are local variable 
	{
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(ch);

	}

	static void m2(String str, float f) // static method
	{
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(f);

	}


	public static void main(String[] args) {
		TestExample_2 example_2=new TestExample_2();
		example_2.m1(10, 'a');
		example_2 .m2("name", 10.5f);
		
	}

}
