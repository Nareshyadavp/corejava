package com.sorting.employeebycomparable;

public class Employee implements Comparable<Employee>{
public int id;
public String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public int compareTo(Employee e) {

	return name.compareTo(e.name);
}

// by using normal version
/*
 * @Override public int compareTo(Object o) { // compareTo is object cls
 * Employee emp=(Employee) o; //sorting of the employee if(id==emp.id) return 0;
 * else if(id>emp.id) return 1; else return -1;
 * 
 * }
 */

}
