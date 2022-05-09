package com.exceptionhanding.finallyblock;

public class Case_9 {

	public static void main(String[] args) {
try {
	System.out.println(10/0);  // AE
}

catch(ArithmeticException ae) {
	System.out.println("ramu".charAt(10));  //SIOBE
	
}
finally {
	int [] a= {10,20,30};
	System.out.println(a[7]);  //AIOE
}

	}

}
