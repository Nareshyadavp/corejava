package com.cursor.iteratorcursor;

import java.util.ArrayList;
import java.util.Iterator;

 

public class IterratorCursor {

	public static void main(String[] args) {
ArrayList<String>arrayList=new ArrayList<String>();
arrayList.add("Name");
arrayList.add("Age");
arrayList.add("EmpNo");
arrayList.add("CompanyName");

/*
 * //Read the by using iterator :normal version Iterator<String>
 * itr=arrayList.iterator(); while(itr.hasNext()){ System.out.print(itr.next());
 * }
 */

Iterator<String>itr=arrayList.iterator();
	while(itr.hasNext()) {// cheking data
		String s=itr.next();//reading data
		System.out.println(s);
		
	}
	}

}
