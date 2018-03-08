package com.ocjp.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListRemoveDublicate {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Ranjan");
		al.add(19);
		al.add("B");
		al.add("Ranjan");
		al.add("J2EE");
		al.add("JSP");
		al.add("JAVA"); 
		al.add("SERVLETS");
		al.add("JAVA");
		al.add("STRUTS");
		System.out.println(al);
		
		Set s =new HashSet(al);
		System.out.println(s);
		al.clear();
		al.add(s);
		System.out.println(al);
		
	}

}
