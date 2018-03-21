package com.ocjp.programs;

public class EqualsMethodTest {

	public static void main(String[] args) {
		Parant p1  = new Parant();
		Parant p2 = new Parant();
		
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
		System.out.println(p1.equals(null));
		//System.out.println(null.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println();
		
		int i = 1;
		Integer n = new Integer(1);
		System.out.println(i==n);
		System.out.println("\n");
		System.out.println("String test");
		
		String str = "abc";
		String str1 = new String("abc");
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		System.out.println("str hashcode : "+str.hashCode());
		System.out.println("str1 hashcode : "+str1.hashCode());
		
		Student s1 = new Student(101, "Ranjan");
		Student s2 = new Student(101, "Ranjan");
		Student s3 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
	}

}
