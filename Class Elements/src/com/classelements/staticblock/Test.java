package com.classelements.staticblock;

public class Test {

	Test(){
		System.out.println("0-arg cons");
	}
	Test(int a){
		System.out.println("1-arg cons");
	}

	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2 ");
	}
	static {
		System.out.println("staic block-1");
	}
	static {
		System.out.println("staic block-2");
	}

	public static void main(String[] args) {
new Test();  //nameless object
new Test(10);
new Test();
	}

}
