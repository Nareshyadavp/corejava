package com.exceptionhanding.trycatchblock;

// Applicaltion without try catch

public class WithTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			System.out.println("ramu");
			System.out.println("anu");

		} catch (ArithmeticException ae) {

			System.out.println(10 / 2);

		}
		System.out.println("rest of the application");

	}

}
