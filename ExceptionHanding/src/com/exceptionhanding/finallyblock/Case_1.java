package com.exceptionhanding.finallyblock;

//case-1   
 // in try block no exception rised so catch block is not  executed no need matched

public class Case_1 {

	public static void main(String[] args) {
try {
	System.out.println("try block");
}
catch(ArithmeticException ae) {
	System.out.println("catch"); 
}
finally {
	System.out.println("finally block");
}
	}

}
