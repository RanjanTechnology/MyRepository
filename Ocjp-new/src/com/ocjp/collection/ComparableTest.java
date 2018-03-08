package com.ocjp.collection;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		Course c =new Course("BCA", "45", "SRS");
		Course c1 = new Course("ABC", "63", "SMU");
		Course c2 = new Course("MCA", "25", "SMU");
		Course c3 = new Course("D.tech", "35", "SMU");
		
		TreeSet<Course> ts = new TreeSet<Course>();
		ts.add(c);
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		System.out.println(ts);
		
		/*String eamil="abc1234@gmail.com";
		System.out.println(eamil);
		String email2= eamil.toLowerCase();
		System.out.println(email2);*/
	}

}
