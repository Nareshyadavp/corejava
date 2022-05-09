package com.datatypes.decimalconversions;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// DecimalToOctal Converting
		Scanner input = new Scanner(System.in);
		System.out.println("Enter he Decimal number:");
		int decimal = input.nextInt();
		System.out.println("Enter the Octal Equivalent number:" + decimal + "is");
		System.out.println(Integer.toOctalString(decimal)); // by using Integer.toOctalString()

		// OcatlToDecimal Converting
		System.out.println("Enter The Octal number:");
		String octal = input.next();
		System.out.println("Enter The Decimal Equivalent number" + octal + " is:");
		System.out.println(Integer.parseInt(octal, 8));
	}

}
