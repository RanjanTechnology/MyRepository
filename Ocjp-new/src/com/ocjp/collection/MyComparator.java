package com.ocjp.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		
		//alphabetic way
		return stu1.getName().compareTo(stu2.getName());
		
	    //return stu2.getName().compareTo(stu1.getName());
		
		//return stu1.getCourse().compareTo(stu2.getCourse());
	}

}
