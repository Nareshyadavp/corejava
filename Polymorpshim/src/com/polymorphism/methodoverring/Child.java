package com.polymorphism.methodoverring;

// Rule-1 overriden method signature & overriding method signature must be same
class Parent {
	// overriden method
	void marry()  {   //---->
		System.out.println("block colour");
	}
}

public class Child extends Parent {
	// overring method
	void marry()  {
		System.out.println("red colour");
	}
void property() {
	System.out.println("child of property");
}
	public static void main(String[] args) {
 		Parent p=new Parent();  //block colour
		p.marry();
		
		Child c=new Child();  //red colour
		c.marry();
		
		Parent p1=new Child();  //red colour
		p1.marry();   
		
	 	}

}
// p.marry(); 
//compiler : checking the parent cls of method 
//runtime (jvm): checking the object creation (overr)of class based on the runtime object