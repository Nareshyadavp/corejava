package com.classelements.constructors;

public class OneConstructorToAnotherConstructor2 {

	
	OneConstructorToAnotherConstructor2(){
		this(10);
//		this(10,20); this is second line

		System.out.println("0-arg constructor");
	}

	OneConstructorToAnotherConstructor2(int a){
		System.out.println("1-arg constructor");
	}
	

	OneConstructorToAnotherConstructor2(int a,int b){
		System.out.println("2-arg constructor");
	}
	

	public static void main(String[] args) {
		OneConstructorToAnotherConstructor2 cn1=new OneConstructorToAnotherConstructor2();
		 
	}


}
//Constructor call must be the first statement in a constructor
