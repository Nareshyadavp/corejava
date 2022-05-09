package com.classelements.instanceblock;

public class Test1 {   // by using multiple object creation


	Test1(){
		System.out.println("0-rg constructor");
	}
	Test1(int a){
		System.out.println("1-rg constructor");
	}
	Test1(int a,int b){
		System.out.println("2-rg constructor");
	}
	{
			System.out.println("instance block");
		
	}

	public static void main(String[] args) {
		new Test1();    // ins-con
		new Test1(10);  //ins-con
		new Test1(1,2); //ins-con
	}

}
