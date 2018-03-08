package com.ocjp.collection;

public class Course implements Comparable<Course>{
	private String name;
	private String sets;
	private String collage;
	
	public Course(String name, String sets, String collage) {
		super();
		this.name = name;
		this.sets = sets;
		this.collage = collage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSets() {
		return sets;
	}
	public void setSets(String sets) {
		this.sets = sets;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", sets=" + sets + ", collage=" + collage + "]";
	}
	@Override
	public int compareTo(Course course) {
		Course c = (Course)course;
		
		//int i = this.name.compareTo(c.name);
		int sets = this.sets.compareTo(c.sets);
		if(sets<0){
			return -1;
		}else if(sets>0){
			return 1;
		}else
			return 0;
		
		//  1 - This particular object is greater than the object we are comparing against(User user)
		//  0 - This particular object is equal than the object we are comparing against(User user)
		// -1 - This particular object is less than the object we are comparing against(User user)
		
		//return this.getName().compareTo(course.getName());
	}
	
	
}
