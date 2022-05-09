package com.classelements.constructors;

public class OneConstructorToAnotherConstructor1 {

	OneConstructorToAnotherConstructor1(){
		System.out.println("0-arg constructor");
		//this(10);

	}

	OneConstructorToAnotherConstructor1(int a){
		System.out.println("1-arg constructor");
	//	this(10,20);

	}
	

	OneConstructorToAnotherConstructor1(int a,int b){
		System.out.println("2-arg constructor");
	}
	

	public static void main(String[] args) {
		OneConstructorToAnotherConstructor1 cn1=new OneConstructorToAnotherConstructor1();
		 
	}

}
/*
 * /Exception in thread "main" java.lang.Error: Unresolved compilation problems:
 * Constructor call must be the first statement in a constructor Constructor
 * call must be the first statement in a constructor
 */