package com.exceptionhanding.category_2;


//case-2 jvm  internally uses print stackTrade() default  
public class Case_2 {

	void m3() {
		
			System.out.println(10/0);
	}
		 void m2() {
	 m3();
}
	void m1() 
	{   m2();
		
	}
	public static void main(String[] args) {
		Case_2 c=new Case_2();
c.m1();
	}

}
