package com.exceptionhanding.nestedtryblock;

//case-1 no exception rised
//1 2 3 4 5 6 15 16 17 18
//case-2  exception rised in statement-2     will get only 1 ABT
//case-3 exception rised in statement-3  catch block is matched 

public class Test {

	public static void main(String[] args) {
System.out.println("statement-1");
//System.out.println("statement-2");
System.out.println(10/0);  // ---->stat-2


		try {
			System.out.println(10/0);
			//System.out.println("statement-3");
			System.out.println("statement-4");

			try {
				System.out.println("statement-5");
				System.out.println("statement-6");

			}
	 			
			catch(ArithmeticException inner1) {
				System.out.println("statement-7");
				System.out.println("statement-8");

				
			}
		}
 			
		catch(ArithmeticException outer) { 
			System.out.println(10/2);
		//	System.out.println("statement-9");
		System.out.println("statement-10");

			
			try {  System.out.println("statement-11");
			System.out.println("statement-12");

				
			}
	 			
			catch(ArithmeticException inner1) {  System.out.println("statement-13");
			System.out.println("statement-14");

				
			}
		}
		finally {
			System.out.println("statement-15");
			System.out.println("statement-16");

		}
		System.out.println("statement-17");
		System.out.println("statement-18");

	}
	

}
