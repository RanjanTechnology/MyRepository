package com.ocjp.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapWithUserObject {

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
	
		System.out.println("*********************************************************************************");		
		Set<Entry<String, Student>> s = map.entrySet();
		Iterator<Entry<String, Student>> itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry<String, Student> m = (Map.Entry<String, Student>)itr.next();
			System.out.println(m);
		}
	}

}
