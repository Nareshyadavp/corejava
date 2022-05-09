package com.sorting.employeebycomparator;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{

	 
	public int compare(Employee e1, Employee e2) {
		return  e1.name.compareTo(e2.name);  // by using homogenious so we will get compareTo()
	}

}
