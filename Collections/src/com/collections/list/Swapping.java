package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class Swapping {

	public static void main(String[] args) {
ArrayList <String>arrayList =new ArrayList<String>();
arrayList.add("rathan");
arrayList.add("durga");
arrayList.add("soft");
arrayList.add("ram");

System.out.println("Before swapping :"+arrayList);

Collections.swap(arrayList, 1, 2);
System.out.println("After Swapping:"+arrayList);


ArrayList<String> arrayList1=new ArrayList<String>(arrayList.subList(1, 3));
arrayList1.add("xxx");
System.out.println(arrayList1);


	}

}
