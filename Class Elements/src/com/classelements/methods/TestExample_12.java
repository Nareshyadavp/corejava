package com.classelements.methods;
class Emp1{}

class X1{}

public class TestExample_12 {  // method vs returning  object [different class]

	Emp1 m1() {
		System.out.println("m1 method");
		Emp1 e=new Emp1();
		return e; // return new Emp();
	
	}
	
	X1 m2() {
		System.out.println("m2 method");
		X1 xx=new X1 ();
		return xx;
	}
	static String m3() {
		System.out.println("m3 method");
		return "rathan";
	}
	public static void main(String[] args) {
		TestExample_12 example_12=new TestExample_12();
		Emp1 e=example_12.m1();
		X1 xx=example_12.m2();
	String str=	example_12.m3();
	System.out.println(e);

	System.out.println(xx);
	System.out.println(str);
	}

}
