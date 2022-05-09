package com.exceptionhanding.throws1;
// deligate responsbility to calling method
public class Test {
	void studentList() throws InterruptedException {    
		System.out.println("anu is sleeping");
		Thread.sleep(10000);
		System.out.println("anu is sleeping");

	}
	void hod() throws InterruptedException   {
		studentList();
	}
	void principal() throws InterruptedException   {
		hod();
	}
	void offieBoy() throws InterruptedException   {
		principal();
		
	}
	
void child() {

}

	public static void main(String[] args) throws InterruptedException {
		Test t=new Test();
		t.offieBoy();
		
		
		
			}

}
