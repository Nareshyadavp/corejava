package com.datatypes.decimalconversions;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		// Decimal to Binary Converting
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Decimal number:");
		int decimal = input.nextInt();
		System.out.println("Enter the Binary Equivalent of " + decimal + " is : ");
		System.out.println(Integer.toBinaryString(decimal));// by using Integer.toBinaryString()

		// Binary to Decimal Converting
		System.out.println("Enter he Binary number:");
		String binary = input.next();
		System.out.println("Enter the Decimal Equivalent of" + binary + " is: ");
		System.out.println(Integer.parseInt(binary, 2)); // by using Integer.parseInt()
	}
}