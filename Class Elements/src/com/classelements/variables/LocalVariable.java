package com.classelements.variables;

public class LocalVariable {

	public static void main(String[] args) {
     int a=10;
     float f=10.0f;             // Declared Inside the method (
     System.out.println(a);
     System.out.println(f);     //  Accessing the within the methods (or) constructors (or) blocks  outside not possible to access
    System.out.println(a+f);
	}
	/*
	 * public void m1() 
	 * { System.out.println(a);
	 *  System.out.println(f);
	 * System.out.println(a+f);
	 *  } //outside not possible to access
	 */
}
