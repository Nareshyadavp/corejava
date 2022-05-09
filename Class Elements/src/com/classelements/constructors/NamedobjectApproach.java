package com.classelements.constructors;

public class NamedobjectApproach {

	
	NamedobjectApproach (){
		System.out.println("0-arg constructor");
	}

	NamedobjectApproach(int a){
		System.out.println("1-arg constructor");
	}
	

	NamedobjectApproach(int a,int b){
		System.out.println("2-arg constructor");
	}
	

	public static void main(String[] args) {
		
		//Named Object approach
		NamedobjectApproach n1=new NamedobjectApproach();
		NamedobjectApproach n2=new NamedobjectApproach(10);
		NamedobjectApproach n3=new NamedobjectApproach(10,20);
		
		 
	}



}
