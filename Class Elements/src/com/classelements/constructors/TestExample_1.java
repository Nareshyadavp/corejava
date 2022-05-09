package com.classelements.constructors;

public class TestExample_1 {  
void m1(){
	System.out.println("m1 method");
}

/*   //   compiler generating  default constructor
 * Test(){
 *      // empty implementation
 * }
 */
	public static void main(String[] args) {
		TestExample_1 t=new TestExample_1();
		t.m1();

	}

}
