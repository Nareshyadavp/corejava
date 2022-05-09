package com.abstractelements.assaignment_1;
abstract class Test{
	abstract void m1();
	abstract void m2();
	  void m3(int a,int b) {
		  System.out.println("Test m3 method");
		  System.out.println(a);
		  System.out.println(b);
	  }

	
}
public class Test1 extends Test {
	 
		void m1() {
	System.out.println("m1 method");		
		}

		 
		void m2() {
	System.out.println("m2 method");		
		}
 
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1();
		t.m2();
	t.m3(10, 20);
	
	// parent ref variable to child objt
				Test t1=new Test1();
				t1.m3(10, 20);
				t1.m1();
		
		
		
	}
}
	