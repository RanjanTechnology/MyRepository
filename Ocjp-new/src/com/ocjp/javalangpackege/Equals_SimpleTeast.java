package com.ocjp.javalangpackege;

public class Equals_SimpleTeast {

	public static void main(String[] args) {
		Student s1 = new Student("Ranjan", 101,"Java");
		Student s2 = new Student("Ranjan", 101,"Java");
		Student s3 = new Student("Ranjan", 101,"Java");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		System.out.println(s3.getName().equals(null));
	}

}
