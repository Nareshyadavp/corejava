package com.polymorphism.methodoverring;

// Rule-4 final method not possible to overriding the child class methodclass
//case-1 Localvariable
public final class LocalVariable {

	public static void main(String[] args) {
 final int a=10;  //loacl variable appliable final modifier
//a=a+10; // we can not reassign the values once we declare final
System.out.println(a);
	}

}
