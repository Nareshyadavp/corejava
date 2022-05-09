package com.exceptionhanding.category_2;


//case-1
public class  Case_1 {
	
	void m3() {
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException ae){
			System.out.println(ae);  // printing ref variable //to string internallly
			System.out.println(ae.getMessage());  // discription
			ae.printStackTrace();  // complete stacktrade
		}
	}
void m2() {
	 m3();
}
	void m1()   
	{   m2();
		
	}
	public static void main(String[] args) {
		Case_1 c=new Case_1();
c.m1();
	}

}
