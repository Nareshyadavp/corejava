package com.enh1;
class P{
	float   salary =2000.5f;
}
class C  extends P{
	
	int  bouns=1000;
}
public class Test {

	public static void main(String[] args) {
	
C c=new C();
System.out.println("total salary:"+(c.salary+c.bouns));
}

}