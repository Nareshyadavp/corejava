package com.map.linkedhashmapbyproductandinteger;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
LinkedHashMap<Integer,Product> lhm= new LinkedHashMap<Integer,Product>();
lhm.put(1, new  Product(111, "pen", 100));
lhm.put(2, new  Product(222, "bottle", 80));
lhm.put(3, new  Product(333, "book", 20));

Set<Entry<Integer,Product>> s=lhm.entrySet();  //entryset()
Iterator<Entry<Integer,Product>> itr=s.iterator();
while ( itr.hasNext()) {   //checking data
 Entry<Integer,Product> e=itr.next();
 Product   p=e.getValue();
 if(p.id==111)  // here integeer will get ==
	 itr.remove();
 if(p.name.equals("bottle"))  //here sting so will get equals();
itr.remove();
}
 //print the data using for-each loop
 for(Entry<Integer,Product> s1:lhm.entrySet()) {
Product p=s1.getValue();
System.out.println(p.id+" "+p.name+" "+p.cost);}
}
}