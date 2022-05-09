package com.polymorphism.methodoverloading;

public class ConstructorOverLoading {
	// constructor loading or compilertimepolymerphism or static or earlybing
	ConstructorOverLoading(int a) {
		System.out.println("int 1-arg cons");
	}

	ConstructorOverLoading(long l, float f) {
		System.out.println(" log ,float 2-arg cons");

	}

	ConstructorOverLoading(char a) {
		System.out.println("char arg cons ");

	}

	public static void main(String[] args) {
		new ConstructorOverLoading(10);
		new ConstructorOverLoading(10, 105.f);
		new ConstructorOverLoading('a');
	}

}
