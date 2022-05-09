package com.polymorphism.methodoverring;

//Rule -2 return type must be same at the primitive datatypes level
  class Parent1 {
	int marry(int a) {
		System.out.println("block colour");
		return 10;

	}
}

public class Child1  extends Parent1 {
	int marry(int a) {
		System.out.println("red colour");
		return 10;
	}

	public static void main(String[] args) {
Child1 c =new Child1();
c.marry(10);
}

}
