package com.classelements.methods;

public class TestExample_9 {   //inside the static method this keyword not allowed

	int a=10;
	int b=20;   // instance variable
		
		 static void add(int a,int b) // local variable
		{
			System.out.println(a+b);
		//	System.out.println(this.a+this.b);  // by using this keyword

		}
		public static void main(String[] args) {
			TestExample_9 example_9=new TestExample_9();
			example_9.add(100, 200);
		}


}
