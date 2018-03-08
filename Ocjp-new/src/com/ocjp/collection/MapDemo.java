package com.ocjp.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		map.put("101", "Ranjan");
		map.put("102", "Vikash");
		map.put("103", "Rakesh");
		map.put("104", "ABC");
		
		System.out.println(map);
		map.put("105", "XYZ");
		
		Set<String> s = map.keySet();
		System.out.println(s);
		
		Collection<String> c = map.values();
		System.out.println(c);
		
		Set<Entry<String, String>> s1 = map.entrySet();
		Iterator<Entry<String, String>> itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> m1 = (Map.Entry<String, String>)itr.next();
			System.out.println(m1.getKey()+"-----------------------"+m1.getValue());
			if(m1.getKey().equals("104")){
				m1.setValue("Master");
			}
		}
		System.out.println(map);
		
	}

}
