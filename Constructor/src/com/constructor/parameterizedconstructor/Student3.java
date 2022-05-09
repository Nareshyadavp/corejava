package com.constructor.parameterizedconstructor;

class Student3 {
	int id;
	String name;

	// creating a parameterized constructor
	Student3(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}
}