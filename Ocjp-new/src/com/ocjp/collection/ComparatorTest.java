package com.ocjp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ranjan", "BCA", "101");
		Student s2 = new Student("Aman", "B.tech", "101");
		Student s3 = new Student("Sanjay", "PG", "101");
		Student s4 = new Student("Deepak", "MCA", "101");
		
		/*TreeSet<Student> ts = new TreeSet<>(new MyComparator());
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		System.out.println(ts);*/
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println(al);
		
		Collections.sort(al, new MyComparator());
		System.out.println(al);
	}

}
