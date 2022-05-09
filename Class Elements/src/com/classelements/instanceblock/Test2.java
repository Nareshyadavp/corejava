package com.classelements.instanceblock;

public class Test2 {   //by using single constructor
	Test2(){
		System.out.println("0-org constructor");
	}
	{
		System.out.println("instance block");
	}
	public static void main(String[] args) {
new Test2();
new Test2();
new Test2();
	}

}
