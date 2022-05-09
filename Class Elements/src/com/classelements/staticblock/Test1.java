package com.classelements.staticblock;

public class Test1 {
		static {
		System.out.println("staic block-1");
	}
	static {
		System.out.println("staic block-2");
	}
public static void main(String[] args) { // upto 1.5 version we will get the static blocks without main method
	//from 1.6 version without main method we can not get static blocks
	// without object creation we will get the static blocks because of its executed by the class loaded
}
	 	}

