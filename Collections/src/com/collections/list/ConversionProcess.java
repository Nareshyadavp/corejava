package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionProcess {

	public static void main(String[] args) {

		// conversion of arrays to collection
		String []s= {"aaa","bbb","ccc"};
		ArrayList<String>arrayList=new ArrayList<String>(Arrays.asList(s));  // how to pass array data 
		arrayList.add("rathan");
		arrayList.add("ram");
		System.out.println(arrayList);
	
	
	// conversion of generics collections to arrays
		
		ArrayList<String>arrayList1=new ArrayList<String>();    
		arrayList1.add("rathan");
		arrayList1.add("ram");
		System.out.println(arrayList);
	String []s1=new String[arrayList1.size()]; 
	arrayList1.toArray(s1);
	
	// conversion of  normal collections to arrays
	
	/*ArrayList arrayList2 =new ArrayList();    
	arrayList2.add("rathan");
	arrayList2.add("ram");
	arrayList2.add(10);
	Object o=new arrayList2.toArray();
	for(String ss:s1) {
		System.out.println(ss);
	*/}
	}


