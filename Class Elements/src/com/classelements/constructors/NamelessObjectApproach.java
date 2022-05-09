package com.classelements.constructors;

public class NamelessObjectApproach {

	
	NamelessObjectApproach (){
		System.out.println("0-arg constructor");
	}

	NamelessObjectApproach(int a){
 		System.out.println("1-arg constructor");
	}
	

	NamelessObjectApproach(int a,int b){
		System.out.println("2-arg constructor");
	}
	

	public static void main(String[] args) {
		
		//Nameless Object approach
		new NamelessObjectApproach();
		new NamelessObjectApproach(10);
       new NamelessObjectApproach(10,20);
		
		 
	}



}
