package com.exceptionhanding.category_3pipe;

// case-1 unchecked
import java.util.Scanner;

public class Case_1 {
	
	
	public static void main(String[]args) {
	
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number:");
			int n=scan.nextInt();
			System.out.println(10/n);
			System.out.println("ramu".charAt(10));
			
		}
		catch(ArithmeticException|NumberFormatException e) {
			System.out.println("rathan"+e);
		}
		catch(StringIndexOutOfBoundsException|ClassCastException |NullPointerException a) {
			System.out.println("durga"+a);
		}
		System.out.println("rest of the application");
	}

}
