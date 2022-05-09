package com.inferface;

interface InterfaceOfParent   //abstract
{
	void m1();  // public abstract
	void m2();  // public abstract
	void m3();  // public abstract
	
}

public class Child  implements InterfaceOfParent{
	 public void m1() 
	{
		System.out.println("m1 method");
		}
	 public void m2()
	{
		System.out.println("m2 method");
		}
	 public	void m3()
	{
		System.out.println("m3 method");
		}

	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
		c.m2();
		c.m3();
		
		
	// interface is able to hold implements class
		InterfaceOfParent it=new Child(); 
		it.m1();
		it.m2();
		it.m3();
	
	}

}
