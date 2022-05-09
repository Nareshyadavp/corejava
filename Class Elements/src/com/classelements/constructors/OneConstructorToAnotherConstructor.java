package com.classelements.constructors;

public class OneConstructorToAnotherConstructor {   // By using this keyword

	
	OneConstructorToAnotherConstructor(){
		this(10);
		System.out.println("0-arg constructor");
	}

	OneConstructorToAnotherConstructor(int a){
		this(10,20);
		System.out.println("1-arg constructor");
	}
	

	OneConstructorToAnotherConstructor(int a,int b){
		System.out.println("2-arg constructor");
	}
	

	public static void main(String[] args) {
		OneConstructorToAnotherConstructor cn1=new OneConstructorToAnotherConstructor();
		 
	}

}
