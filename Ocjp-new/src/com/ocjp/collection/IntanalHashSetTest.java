package com.ocjp.collection;

import java.util.HashSet;

public class IntanalHashSetTest {

	public static void main(String[] args) {
		Student s1 = new Student("Ranjan", "BCA", "101");
		Student s2 = new Student("Ranjan", "BCA", "101");
		
		HashSet<Object> hs = new HashSet<>();
		
		System.out.println(s1.equals(s2));
		hs.add(s1);
		hs.add(s2);
		hs.add(null);
		System.out.println(hs.size());
		System.out.println(hs);
		
	}

}
