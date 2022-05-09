package com.classelements.instanceblock;

public class Test4 {
	Test4(){
		this(10);
		System.out.println("0-org constructor");
	}
	Test4(int a){
		System.out.println("1-org constructor");
	}
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		new Test4();

	}

}
