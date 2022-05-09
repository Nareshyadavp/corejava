package com.clonening.serialization1;

import java.io.Serializable;

public class Employee implements  Serializable {
	 	String ename;
	 	int eid;
	public Employee(String ename, int eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
	 
}



// if variable declear on the transinet those variable not got serializable 