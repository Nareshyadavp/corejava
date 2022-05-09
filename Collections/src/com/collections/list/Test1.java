package com.collections.list;

import java.util.ArrayList;

/*One obj    Collections data
add()    vs addAll()
contains() vs containsAll()
remove()   vs removeAll()
removeAll() vs retainAll()*/


public class Test1 {

	public static void main(String[] args) {

		Emp emp=new Emp(1,"anu");
		Emp emp1=new Emp(2,"brother");
		Emp emp2=new Emp(3,"ram");
		Emp emp3=new Emp(4,"suri");
	
	
	
	ArrayList<Emp> arrayList=new ArrayList<Emp>();
	arrayList.add(emp);
	arrayList.add(emp1);
	

	ArrayList<Emp> arrayList1=new ArrayList<Emp>();
	arrayList1.addAll(arrayList);
	arrayList1.add(emp2);
	arrayList1.add(emp3);
	
	/*
	 * System.out.println(arrayList1.contains(emp1));
	 * System.out.println(arrayList1.containsAll(arrayList));
	 * arrayList1.remove(emp1); System.out.println(arrayList1.contains(emp1));
	 * System.out.println(arrayList1.containsAll(arrayList));
	 * 
	 * 
	 * arrayList1.removeAll(arrayList); // All arrayList objects are removed 10c: 3c
	 * arrayList1.retainAll(arrayList); // All retainAll arrayList1 except arrayList
	 * 10c:3c
	 */
	for(Emp e:arrayList1){
		System.out.println(e.id+" "+e.name);
	}
	
	
	}

}
