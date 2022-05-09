package com.classelements.instanceblock;

public class Test {  // by using single object creation
	Test(){
		System.out.println("0-rg constructor");
	}
	{
		System.out.println("instance block");  //first executed instance object
	}
	public static void main(String[] args) {
		new Test();
	}

}
