package com.ocjp.javalangpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class ImmutableStudent {
	
	private final String name;
	private final int rollNo;
	private final Course course;
	private final List<String> subjects;
	private final Date dob;
	
	public ImmutableStudent(String name, int rollNo, Course course, List<String> subject, Date dob) {
	
		List<String> list = new ArrayList<>();
		Iterator<String> itr = subject.iterator();
		while(itr.hasNext()){
			String str = (String)itr.next();
			list.add(str);
		}
		
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
		this.subjects= list;
		this.dob = new Date(dob.getTime());
	}
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public Course getCourse() {
		
		Course cloneCourse = new Course();
		cloneCourse.setCourseId(course.getCourseId());
		cloneCourse.setCourseName(course.getCourseName());
		
		return cloneCourse;
	}
	public List<String> getSubjects() {
		return Collections.unmodifiableList(this.subjects);
	}
	public Date getDob() {
		return new Date(dob.getTime());
	}

	@Override
	public String toString() {
		return "ImmutableStudent [name=" + name + ", rollNo=" + rollNo + ", course=" + course + ", subjects=" + subjects
				+ ", dob=" + dob + "]";
	}
	
}
