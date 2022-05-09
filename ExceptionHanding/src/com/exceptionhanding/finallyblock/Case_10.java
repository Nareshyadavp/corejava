package com.exceptionhanding.finallyblock;


// return type with blocks
public class Case_10 {
	int m1() {

		try {
			System.out.println(10/0);
			return 10;
		}
		catch(ArithmeticException ae) {
		return 20;	
		}
		 	
		finally {
			return 30;
			}
	}
	public static void main(String[] args) {
		Case_10 case_10=new Case_10();
		
		int x=case_10.m1();
		System.out.println(x);
	}
}
