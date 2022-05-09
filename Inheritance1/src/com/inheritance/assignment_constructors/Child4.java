package com.inheritance.assignment_constructors;

 class Parent4{
	 Parent4(int a){
		 System.out.println("parent4 class 1-arg cons");
	 }
 }
 public class Child4 extends Parent4 {
	Child4()
	{
		super(10);  // calling 1-arg cons
		 System.out.println("child4 class 0-arg cons");

	}
	
	public static void main(String[] args) {
new Child4();
	}

}
