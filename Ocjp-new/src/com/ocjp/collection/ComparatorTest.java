package com.ocjp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ranjan", "BCA", "102");
		Student s2 = new Student("Ranjan", "MCA", "101");
		Student s3 = new Student("Sanjay", "PG", "103");
		Student s4 = new Student("Deepak", "MCA", "104");
		
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
		
		//Collections.sort(al, new MyComparator());
		Collections.sort(al, new MyStudentCompartor());
		System.out.println(al);
	}

}
