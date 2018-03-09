package com.ocjp.java.defultMethod;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		
		MyInteface myInteface = new MyClass();
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(101, "Ranjan"));
		students.add(new Student(102, "Shashi"));
		students.add(new Student(103, "Priya"));
		students.add(new Student(104, "Aman"));
		
		List<Student> sortStudent = myInteface.sortStudent(students);
		for(Student student : sortStudent){
			System.out.println(student);
		}
		
		System.out.println("-------------------------------------------------------");
		MyInteface.greet("Ranjan");
		
		List<Integer> intValue = new ArrayList<>();
		intValue.add(1011);
		intValue.add(10);
		intValue.add(7892);
		intValue.add(8097);
		System.out.println("-------------------------------------------------------");
		int max = myInteface.getMaxNumber(intValue);
		System.out.println("Max value in list: "+max);
		
	}

}
