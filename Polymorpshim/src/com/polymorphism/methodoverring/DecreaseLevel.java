package com.polymorphism.methodoverring;

//Rule no-7
//case -3 DecreaseLevel modifiers applicable not supports java
class Parenttt1{
	public void m1() { //DecreaseLevel
		System.out.println("parenttt m1 method");
	}
}

public class DecreaseLevel extends Parenttt1 {
	//  void m1() { //DecreaseLevel
	//	System.out.println("DecreaseLevel  m1 method");
	//}

	public static void main(String[] args) {
		new DecreaseLevel().m1();
	}

}


//	Cannot reduce the visibility of the inherited method from Parenttt1

