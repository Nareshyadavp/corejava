package com.classelements.staticblock;

public class A {  // by using forname()
static {
	System.out.println("static block-a");
}
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("B");
		Class.forName("C");   //dinamicaly loaded
	}

}
