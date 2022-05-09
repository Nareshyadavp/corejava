package com.exceptionhanding.finallyblock;

// finally block not executed
public class Case_7 {

	public static void main(String[] args) {
		System.out.println(10/0);
		try {
			System.out.println("try");
		}
		finally {
			System.out.println("finally block");
		}

	}

}


// once the controll is entred in try block then only final block executed