package com.ocjp.javalangpackege;

public class Student {
	private String name;
	private int rollNo;
	private String subject;

	public Student(String name, int rollNo, String subject) {
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		int hash = rollNo * 2;
		return hash;
	}

	/*@Override
	public boolean equals(Object obj) {

		try {
			Student s = (Student) obj;
			if (name.equals(s.name) && rollNo == s.rollNo && subject.equals(s.subject)) {
				return true;
			} else
				return false;
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}*/
	
	@Override
	public boolean equals(Object obj) {

		Student s = (Student) obj;
		if (name.equals(s.name) && rollNo == s.rollNo && subject.equals(s.subject))
			return true;
		else

			return false;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", subject=" + subject + "]";
	}

}
