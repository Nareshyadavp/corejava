package com.datatypes.stringconversions;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter The String number:");
		String string = input.next();
		System.out.println("Enter The int Equivalent number" + string + " is:");
		System.out.println(Integer.parseInt(string));

		/*
		 * // without Scanner // Declaring String variable String s = "200"; //
		 * Converting String into int using Integer.parseInt() int i =
		 * Integer.parseInt(s); // Printing value of i System.out.println(i);
		 */

		// By Using Concatenation

		// Declaring String variable
		String s = "200";
		// Converting String into int using Integer.parseInt()
		int i = Integer.parseInt(s);
		System.out.println(s + 100);// 200100, because "200"+100, here + is a string concatenation operator
		System.out.println(i + 100);// 300, because 200+100, here + is a binary plus operator
	}
}
