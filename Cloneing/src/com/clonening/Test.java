package com.clonening;

public class Test implements Cloneable { // initial class not contains clone
	int a = 10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);

//how to create duplicates objects
		Test t1 = (Test) t.clone(); // directly it clone into heap memory
		System.out.println(t.a);
		System.out.println(t.b);
		
		
		
		Test t2 = new Test();   // class loading 
		System.out.println(t2.a);
		System.out.println(t2.b);
		 
		
	}

}
