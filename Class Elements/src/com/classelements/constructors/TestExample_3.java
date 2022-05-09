package com.classelements.constructors;

public class TestExample_3 {
	
	// user Defined constructor
		 
		TestExample_3(int a){
			System.out.println("1-arg constructor");

		}  
		
		public static void main(String[] args) {
		//	TestExample_3 example_3=new TestExample_3();
			TestExample_3 example_33=new TestExample_3(10);
		}

}

// in the class if we are declared at least one constructor that 
//time compiler is not provided default constructor