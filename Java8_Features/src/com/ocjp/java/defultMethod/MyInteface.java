package com.ocjp.java.defultMethod;

import java.util.Collections;
import java.util.List;

public interface MyInteface {
	
	default public List<Student> sortStudent(List<Student> students){
		Collections.sort(students);
		return students;
	}
	
	public static void greet(String name){
		System.out.println("Welcome to java-8: "+name);
	}
	
	public abstract int getMaxNumber(List<Integer> lists);
}
