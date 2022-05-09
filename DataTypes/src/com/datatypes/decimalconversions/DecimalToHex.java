package com.datatypes.decimalconversions;

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {

// Decimal to Hex Converting	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Decimal number:");
		int decimal = input.nextInt();
		System.out.println("Enter The Hex Equivalent number:" + decimal + " is:");
		System.out.println(Integer.toHexString(decimal));

// Hex to Decimal Converting
		System.out.println("Enter The Hex number:");
		String hex = input.next();
		System.out.println("Enter The Decimal Equivalent number:");
		System.out.println(Integer.parseInt(hex, 16));

	}

}
