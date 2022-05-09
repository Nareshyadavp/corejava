package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(111, "naresh");
		hm.put(222, "ram");
		hm.put(6, "raj");
		hm.put(909, "manoj");
		hm.put(888, "ramana");
		System.out.println(hm);
		Set<Integer> s = hm.keySet(); // by using keyset()
		System.out.println(s);

		Collection<String> c = hm.values(); // valuse() contains Collection
		System.out.println(c);
		
		//key value pairs also known as entryset();
		Set<Entry<Integer,String>>s1=hm.entrySet();
		for(Entry<Integer,String> s2:s1) { 
			System.out.println(s2.getKey()+" "+s2.getValue());
			
		}
	}

}
 