package com.switc;

public class ConditionalStatementIfElseIf {

	public static void main(String[] args) {
		int studentMarks = 85;
		if (studentMarks > 85) {
			System.out.println("A grade");
		} else if (studentMarks > 75) {
			System.out.println("B grade");
		}

		else if (studentMarks > 65) {
			System.out.println("C grade");
		}

		else if (studentMarks > 55) {
			System.out.println("D grade");
		} else if (studentMarks > 45) {
			System.out.println("E grade");
		} else if (studentMarks > 35) {
			System.out.println("F grade");
		} else {
			System.out.println("Fail");
		}
	}

}
