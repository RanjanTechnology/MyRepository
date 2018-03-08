package com.ocjp.javalangpackage;

public class Student {
	
	public String name;
	public int rollNo;
	
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Student){
			Student s1 = (Student)obj;
			if(name.equals(s1.name) && rollNo == s1.rollNo){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student: [Name: "+name+", RollNo: "+rollNo+"]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return rollNo;
	}
	
	
}
