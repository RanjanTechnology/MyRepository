package com.ocjp.programs;

public class Student {
	
	private int id;
	private String name;
	
	public Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		Student s1 = (Student)obj;
		int id1 = s1.id;
		String name1 = s1.name;
		
		if(name == name1 && id == id1)
		    return true;
		else
			return false;
	}
	
	
}
