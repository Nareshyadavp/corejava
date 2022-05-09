package com.exceptionhanding.finallyblock;


// finally block is not executed
public class Case_8 {

	public static void main(String[] args) {
try {
	System.out.println("try block");
	System.exit(0); // jvm will shout down
}
finally {
	System.out.println("finally block");
}
	}

}
