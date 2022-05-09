package com.polymorphism.methodoverring;

//Rule no-7
//case -2 IncreaseLevel modifiers applicable
class Parenttt{
	protected void m1() { //increaselevel
		System.out.println("parenttt m1 method");
	}
}
public class IncreaseLevel extends Parenttt{
	public void m1() { //increaselevel
		System.out.println(" IncreaseLevel m1 method");
	}
	public static void main(String[] args) {
	new IncreaseLevel().m1();
	}

}


//protected : within the package outside of the  package of child 