package com.ocjp.collection;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class MyStudentCompartor implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		/*return new CompareToBuilder()
				.append(obj1.getRollNo(), obj2.getRollNo())
				.append(obj1.getName(), obj2.getName())
				.append(obj1.getCourse(), obj2.getCourse()).toComparison();*/
		
		int res;
		res = obj1.getName().compareTo(obj2.getCourse());
		if(res == 0)
			res =  obj1.getRollNo().compareTo(obj2.getRollNo());
		if(res == 0)
			res = obj1.getCourse().compareTo(obj2.getCourse());
		
		return res;
	}

}
