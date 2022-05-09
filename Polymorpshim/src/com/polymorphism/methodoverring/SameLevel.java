package com.polymorphism.methodoverring;
//Rule no-7
//case -1sameLevel modifiers applicable
class Parentt{
	public void m1() { //sameleve
		System.out.println("parentt m1 method");
	}
}
public class SameLevel extends Parentt{
	public void m1() { //sameleve
		System.out.println("samelevel m1 method");
	}

	public static void main(String[] args) {
	new SameLevel().m1();
		
	}

}
