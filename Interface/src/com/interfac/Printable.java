package com.interfac;

interface Printable {
	public static void print() {
	}
}

class Runnable implements Printable {
	public void print() {
		System.out.println("welcome to java interface");
	}

	/*
	 * public static void m3();
	 */
	public static void main(String args[]) {
		Runnable runnable = new Runnable();
		runnable.print();
	}
}


//An interface in Java is a blueprint of a class. It has static constants and abstract methods.