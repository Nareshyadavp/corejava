package com.classelements.instanceblock;

public class Employee {
int eid;
String ename;
float esalary;

// instance block initialized value variable  during object creation
{
	eid=111;
	ename="ramu";
	esalary=3000.0f;
	}
void disp() {
	System.out.println(eid);
	System.out.println(ename);
	System.out.println(esalary);

}
	public static void main(String[] args) {
new Employee().disp();
	}

}
