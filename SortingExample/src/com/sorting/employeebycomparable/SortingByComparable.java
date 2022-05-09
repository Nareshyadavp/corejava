package com.sorting.employeebycomparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortingByComparable {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(111, "ratha"));
		al.add(new Employee(444, "anu"));
		al.add(new Employee(333, "dhurga"));
		al.add(new Employee(666, "swarnas"));
		Collections.sort(al);
		for (Employee e : al) { // by using for loop right side object of class and left handside employee
			System.out.println(e.id + " " + e.name);
		}
	}

}
