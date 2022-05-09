package com.classelements.constructors;

public class Employee {  // default values are printed even object is created

	int eid;        // 0
	String ename;   //null   case-1
	float esalary;  //0.0
	
	// parametried constructor
	Employee(int eid,String ename, float esalary ) {// local variable
		//conversion of local values to instance values
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;  // case-3
	}
	/*
	 * //user defined constructor executed during object creation Employee(){
	 * eid=111; ename="rathan"; esalary=10000.56f; // constructor used to initialize
	 * the some values to instance variable during object creation }  case-2
	 */
	void disp() {
		System.out.println("eid="+eid);
		System.out.println("ename="+ename);
		System.out.println("esalary="+esalary);

	}
	public static void main(String[] args) {
		//Employee  employee=new Employee();//default constructor executed  case-1

		//Employee  employee1=new Employee();//default constructor executed  case-1
	//employee1.disp();
		//Employee  employee2=new Employee();//default constructor executed  case-1
				//employee2.disp();
				
		Employee  employee1=new Employee(111,"rathan",100.67f);	
		employee1.disp();
		Employee  employee2=new Employee(222,"anu",200.76f);
		employee2.disp();   // case-3
		
	}

}
