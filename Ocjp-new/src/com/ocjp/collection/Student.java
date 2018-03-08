package com.ocjp.collection;

public class Student implements Comparable<Student>{
	private String name;
	private String course;
	private String rollNo;
	
	
	public Student(String name, String course, String rollNo) {
		super();
		this.name = name;
		this.course = course;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", rollNo=" + rollNo + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return (s.getName() == this.getName() && s.getCourse() == this.getCourse() && s.getRollNo() == this.getRollNo());
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+course.hashCode()+rollNo.hashCode();
	}
	
	@Override
	public int compareTo(Student Student) {
		
		//  1 - This particular object is greater than the object we are comparing against(User user)
		//  0 - This particular object is equal than the object we are comparing against(User user)
		// -1 - This particular object is less than the object we are comparing against(User user)
		
		return this.getName().compareTo(Student.getName());
	}
}
