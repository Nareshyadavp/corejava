package com.polymerphism.methodoverloading;

class Test {

	public void method(int i) {
		System.out.println("int-arg method ");
	}

	public void method(double d) {
		System.out.println("double-arg method");
	}

	public void method(float f) {
		System.out.println("float-arg method");

	}
}

public class Main {
	public static void main(String[] args) {
		Test test = new Test();// method resolution always take care by compiler based reference variables
		test.method(10);
		test.method(2.0);
		test.method(2f);
	}
}
