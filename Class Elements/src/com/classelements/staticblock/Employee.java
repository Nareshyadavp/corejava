package com.classelements.staticblock;

public class Employee {  // static blocks initialize  the values to static variable during class load
static int eid;
static String ename;  // static variable
static float esalary;

static {
	eid=111;
	ename="rathan";
	esalary=30000.86f;
}
	static void disp() {
		System.out.println(Employee.eid);
		System.out.println(Employee.ename);
		System.out.println(Employee.esalary);
	}
	public static void main(String[] args) {
		Employee.disp();
	}

}
