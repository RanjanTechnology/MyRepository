package com.ocjp.collection;

import java.util.ArrayList;

public class ArrayListObjectTest {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		Course c = new Course("B.tech", "40", "SRM");
		Course c1 = new Course("BCA", "50","SMU");
		
		Student st1 = new Student("Ranjan", c1.getName(), "7");
		Student st2 = new Student("Rakesh", c.getName(), "8");
		
		System.out.println("List is empty : "+al.isEmpty());
		
		al.ensureCapacity(20);
		al.add(c);
		al.add(c1);
		al.add(st1);
		al.add(st2);
		System.out.println(al);
		
		al.remove(c1);
		System.out.println(al);
		al.add(1, c1);
		System.out.println(al);
		al.trimToSize();
		System.out.println("Size of List: "+al.size());
		System.out.println(al.contains(st1));
	}

}
