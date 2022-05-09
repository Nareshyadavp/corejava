package com.exceptionhanding.finallyblock;


// case-5 
public class Case_5 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("catchblock");
		}
		finally {
			System.out.println(10/0);
		}


	}

}


// if finally block contains the exception finally block will executed but abnormal termination
