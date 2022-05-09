package com.classelements.instanceblock;

public class Test3 {  // By using multiple instance
	Test3(){
		System.out.println("0-org constructor");
	}
	Test3(int a){
		System.out.println("1-org constructor");
	}

	{
		System.out.println("instance block");
	}
	{
		System.out.println("instance block");
	}
	
	public static void main(String[] args) {
new Test3();
new Test3(10);
	}
}
