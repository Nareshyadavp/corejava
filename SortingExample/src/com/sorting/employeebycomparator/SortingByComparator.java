package com.sorting.employeebycomparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingByComparator {

	public static void main(String[] args) {
ArrayList<Employee>al=new ArrayList<Employee>();
al.add(new Employee(111,"rathan"));
al.add(new Employee(555,"anu"));
al.add(new Employee(999,"durga"));
al.add(new Employee(666,"swravya"));
/* Collections.sort(al,new EmployeeIdComparator()); */
Collections.sort(al,new EmployeeNameComparator());
for(Employee e:al) {
	System.out.println(e.id+" "+e.name);
}

	}

}
