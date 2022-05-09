package com.classelements.methods;

public class TestExample_11 {  //methods vs primitive data types
	
	int    m1() {
		System.out.println("m1 method");
		return 10;
		
	}
	float    m2() {
		System.out.println("m2 method");
		return 10.5f;
		
	}
	static char    m3() {
		System.out.println("m3 method");
		return 'a';
		
	}


	public static void main(String[] args) {
		TestExample_11 example_11=new TestExample_11();
		int x=example_11.m1();
		System.out.println("return value of m1()="+x);
		
		float f=example_11.m2();
		System.out.println("return value of m1()="+f);

		char ch=example_11.m3();
		System.out.println("return value of m1()="+ch);

	}

}
