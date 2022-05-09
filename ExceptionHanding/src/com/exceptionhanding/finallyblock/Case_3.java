package com.exceptionhanding.finallyblock;


//case_3 befor abnormal termination the finally block will executed catch is not mached

public class Case_3 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException ae) {
			System.out.println("catch"); 
		}
		finally {
			System.out.println("finally block");
		}
			


	}

}
