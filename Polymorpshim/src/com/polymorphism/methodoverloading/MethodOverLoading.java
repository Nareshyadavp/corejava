package com.polymorphism.methodoverloading;

public class MethodOverLoading { // using only one class
	// method overloading or //compilertimepolymerphism// or //static// or earlybing
	void m1(int a)  {
		System.out.println("int m1 method overloading");
	}

	void m1(long l, float f) {
		System.out.println(" long,float m1 method overloading");

	}

	void m1(char a) {
		System.out.println("char m1 method overloading ");

	}

	public static void main(String[] args) {
		new MethodOverLoading().m1(13);
		new MethodOverLoading().m1(10, 10.5f);
		new MethodOverLoading().m1('a');

	}

}
