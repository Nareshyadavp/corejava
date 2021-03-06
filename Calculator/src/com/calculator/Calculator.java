package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter First no:");
		int no1 = scan.nextInt();

		System.out.print("Enter second no:");
		int no2 = scan.nextInt();

		System.out.print("Enter required operator[+,-,/,*]:");
		char operator = scan.next().charAt(0); // string charAt()
if(operator=='+'|| operator=='-'|| operator=='*'||operator=='/'){
		int res = calculate(no1, no2, operator); // calling calculate
		System.out.println(no1 + " " + operator + " " + no2 + " =" + res); // getting result
	}
else {
	System.out.println("Invalid operator please try for +,-,*, or/");
}

scan.close();

	}

// method to perform operator
	static int calculate(int x, int y, char operator) {
		int res = 0;
		switch (operator) {
		case '+':
			res = x + y;
			break;
		case '-':
			res = x - y;
			break;
		case '*':
			res = x * y;
			break;
		case '/':
			res = x / y;
			break;
		}
		return res;
	}
}
