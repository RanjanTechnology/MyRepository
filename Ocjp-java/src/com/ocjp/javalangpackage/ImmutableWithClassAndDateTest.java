package com.ocjp.javalangpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImmutableWithClassAndDateTest {
	
	public static void main(String[] args) {
		
		Course c1 = new Course();
		c1.setCourseId(101);
		c1.setCourseName("BTech");
		
		Course c2 = new Course();
		c2.setCourseId(102);
		c2.setCourseName("MCA");
		
		List<String> subjects1 = new ArrayList<String>();
		subjects1.add("Java");
		subjects1.add("Spring");
		
		List<String> subjects2 = new ArrayList<String>();
		subjects2.add("Hibarnate");
		subjects2.add("Web services");
		
		ImmutableStudent student = new ImmutableStudent("Ranjan", 1, c1, subjects1, new Date());
		ImmutableStudent student2 = new ImmutableStudent("Ranjan", 2, c1, subjects1, new Date());
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println("=====================================================");
		System.out.println(student.getCourse().getCourseId());
		student.getCourse().setCourseId(105);
		System.out.println(student.getCourse().getCourseId());
		
		
	}
}
