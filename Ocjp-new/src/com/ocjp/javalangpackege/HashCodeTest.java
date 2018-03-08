package com.ocjp.javalangpackege;

public class HashCodeTest {

	public static void main(String[] args) {
		Student s1 = new Student("Ranjan", 101, "Java");
		Student s2 = new Student("Gaurav", 102, "Java");
		
		System.out.println(s1);
		System.out.println("Student1 object HashCode: "+s1.hashCode());
		System.out.println("-----------------------------------------------------------------");
		System.out.println(s2);
		System.out.println("Student2 object HashCode: "+s2.hashCode());
	}

}
