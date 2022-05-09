package com.exceptionhanding.finallyblock;


// case-2
//// in try block contains exception rised catch block is matched
public class Case_2 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("catch"); 
		}
		finally {
			System.out.println("finally block");
		}
			

	}

}
