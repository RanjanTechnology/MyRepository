package com.ocjp.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapSortByKey {

	public static void main(String[] args) {
		Student s1 = new Student("Ranjan", "BCA", "101");
		Student s2 = new Student("Rakesh", "BAC", "102");
		Student s3 = new Student("Apurav", "MCA", "103");
		Student s4 = new Student("Deepak", "MCA", "104");
		
		Map<String, Student> map = new HashMap<String,Student>();
		map.put("Stu1", s1);
		map.put("Stu2", s2);
		map.put("Stu3", s3);
		map.put("Stu4", s4);	
		System.out.println(map);
		System.out.println();
		//Map<String, Student> map2 = new TreeMap<>(map);
		/*Map<String, Student> map2 = new TreeMap<String, Student>(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str2.compareTo(str1);
			}
		});*/
		Map<String, Student> map2 = new TreeMap<String, Student>(new HashMapComparator());
		map2.putAll(map);
		System.out.println("*********************************************************************************");		
		Set<Entry<String, Student>> s = map2.entrySet();
		Iterator<Entry<String, Student>> itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry<String, Student> m = (Map.Entry<String, Student>)itr.next();
			System.out.println(m);
		}
		System.out.println();
		System.out.println("*********************************************************************************");		
		System.out.println(map2);
	
	}

}
