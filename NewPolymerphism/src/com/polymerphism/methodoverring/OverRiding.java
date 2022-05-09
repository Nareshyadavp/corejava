package com.polymerphism.methodoverring;

public class OverRiding { // RunTime or Dynamic or Slow

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.marriage();

		Child child = new Child();
		child.marriage();

		Parent parent1 = new Child(); // override is method resolution is always take care by the jvm based on the
										// runtime object
		parent1.marriage();
	}
}

// if the parent method is not satisfy the child method 
// if the sub class provided the specific implements of the method its decided
// by the parent class methods