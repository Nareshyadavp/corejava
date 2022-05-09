package com.exceptionhanding.category_2;


//case-3 execption propogration only uncheked not checked

public class Case_3 {
	void m3() {
		
			System.out.println(10/0);
			
	}
		 void m2() {
	 m3();
}
	void m1() {
	try{ 	  m2();	}
	catch(ArithmeticException ae){
		System.out.println(10/2);	

	}
		
	}
	public static void main(String[] args) {
		Case_3 c=new Case_3();
c.m1();
	}

}
