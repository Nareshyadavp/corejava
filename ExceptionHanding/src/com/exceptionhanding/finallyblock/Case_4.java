package com.exceptionhanding.finallyblock;


// case-4  catch block is matched and exception rised on the cathblock before abnormal termination finally block executed
public class Case_4 {

	public static void main(String[] args) {
try {
	System.out.println(10/0);
}
catch(ArithmeticException ae) {
	System.out.println(10/0);
}
finally {
	System.out.println("finally block");
}
	}

}
