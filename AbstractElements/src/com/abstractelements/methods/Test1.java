package com.abstractelements.methods;

// Hinding the internal implementation highlet the set of services 
abstract class Test {
	abstract void m1();

	abstract void m2();

	abstract void m3();

}

public class Test1 extends Test {
	void m1() {
		System.out.println("m1 method");

	}

	void m2() {
		System.out.println("m2 method");

	}

	void m3() {
		System.out.println("m3 method");

	}

	void m4() {
		System.out.println("m4 method ");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1();
		t.m2();
		t.m3();
		t.m4();  

// parent ref to child obj
		Test p = new Test1();
		p.m1(); // compiler : parent runtime: checking object creation Test1()
		p.m2(); // compiler : parent runtime: checking object creation Test1()
		p.m3(); // compiler : parent runtime: checking object creation Test1()
		Test1 c = (Test1) p; // by using typecasting
		c.m4();
	}
}
