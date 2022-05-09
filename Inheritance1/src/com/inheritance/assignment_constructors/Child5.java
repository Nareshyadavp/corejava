package com.inheritance.assignment_constructors;

//compiler geneerated super and this keys 
  class Parent5{
	Parent5(int a){
		System.out.println("parent5 class 1-arg cons");
	}
}
  public class Child5 {
	Child5(){
		//super(); compiler generated code
		System.out.println("class5 class 0-arg cons");

	}
	Child5(int a){
		//super(); compiler generated code
		System.out.println("class5 class 1-arg cons");

	}


	public static void main(String[] args) {
new Child5();
new Child5(10);

	}

}
