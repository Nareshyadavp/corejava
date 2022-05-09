package com.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		LinkedHashSet<Employee> lhs = new LinkedHashSet<Employee>();
		lhs.add(new Employee(111, "kambagiri"));
		lhs.add(new Employee(222, "mani"));
		lhs.add(new Employee(333, "kumar"));
		
		Iterator<Employee> it=lhs.iterator();// by iterator()
		while (it.hasNext()) {  //checking data
		Employee e=	it.next();  //reading data
		 if (e.id==111)
			 it.remove();// remove data by iterator using integer(==)
		 if(e.name.equals("mani"))
			 it.remove();//remove data by iterator using string (equals())
		
		}
		for(Employee e:lhs) {
			System.out.println(e.id+" "+e.name);
		}	 
	}

}
