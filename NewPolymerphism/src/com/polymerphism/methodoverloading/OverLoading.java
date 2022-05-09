package com.polymerphism.methodoverloading;

public class OverLoading {

	public static void main(String[] args) {

		// System.out.println(Adder.add(11, 11));
		// System.out.println(Adder.add(11, 11, 11));

		Addition ob = new Addition();

		int sum2 = ob.add(1, 2, 3);
		System.out.println("sum of the three integer value :" + sum2);
		double sum3 = ob.add(1.0, 2.0, 3.0);
		System.out.println("sum of the three double value :" + sum3);

		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));

	}
}
// complier time polymerphism or Static or early binging