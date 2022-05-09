package com.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
LinkedHashMap<Employee,Student> lhm= new LinkedHashMap<Employee,Student>();
lhm.put(new Employee(111, "rathan"), new Student(1, "ram"));
lhm.put(new Employee(222, "ramu"), new Student(2, "swarna"));
lhm.put(new Employee(333, "raja"), new Student(3, "anu"));

Set<Employee> s=lhm.keySet(); // Getting keySet()
System.out.println(s);   // printing the data will get hascode
 for(Employee e:s) {
System.out.println(e.id+" "+e.name);
 }
for(Employee e:lhm.keySet()) {  // using for loop
	System.out.println(e.id+" "+e.name);
}
	
 
//print the data values
	for (Student s1:lhm.values()) {  // by using the values()
		System.out.println(s1.id+" "+s1.name);
	}
		
	//Printing the EntrySet()
Set<Entry<Employee,Student>>ss=	lhm.entrySet();
	}
}
