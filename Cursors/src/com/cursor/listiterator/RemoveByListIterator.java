package com.cursor.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveByListIterator {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("ratan");
		arrayList.add("anu");
		arrayList.add("durga");
		//listiterator by generics
		ListIterator<String> lst=arrayList.listIterator();
	lst.add("srawya");   // add by listiterator when we created cursor(srawya)is created in before first record
	while(lst.hasNext()) { //check the data is not available by hasnext()
	String s=lst.next();// read the data by next()
	if(s.equals("durga"))// remove durga
		lst.remove(); //removing the listiterator
	if(s.equals("anu"))
		lst.set("anushka");//replace by set()
	}
System.out.println(arrayList);	
	}

}
