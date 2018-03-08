package com.ocjp.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ranjan", "BCA", "101");
		Student s2 = new Student("Rakesh", "BAC", "102");
		Student s3 = new Student("Apurav", "MCA", "103");
		Student s4 = new Student("Deepak", "MCA", "104");
		
		LinkedHashMap<String, Student> map = new LinkedHashMap<>();
		map.put("Stu1", s1);
		map.put("Stu2", s2);
		map.put("Stu3", s3);
		map.put("Stu4", s4);	
	    System.out.println(map);
	    
	    Set<Entry<String, Student>> s = map.entrySet();
	    Iterator<Entry<String, Student>> itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry<String, Student> m = (Map.Entry<String, Student>)itr.next();
			System.out.println(m);
		}
	}

}
