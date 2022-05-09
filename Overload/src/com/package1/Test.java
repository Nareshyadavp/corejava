package com.package1;

public class Test {
 public void m1() {
	 System.out.println("null");
	 
 }public void m1(int i) {
	 System.out.println("9");
	 
 }
 public void m1(float f) {
	 System.out.println("2.5f");
	 
 }public void m1(String s) {
	 System.out.println("bava");
	 
 }
 
	public static void main(String[] args) {
 Test t=new Test();
 t.m1();
 t.m1(1);
 t.m1(3.5f);
 t.m1("n");
	}

}
