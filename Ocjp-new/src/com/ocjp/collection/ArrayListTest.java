package com.ocjp.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("a");
		al.add(19);
		al.add("B");
		al.add("Ranjan");
		al.add(null);
		al.add("J2EE");
		al.add("JSP");
		al.add("JAVA"); 
		al.add("SERVLETS");
		al.add("JAVA");
		al.add("STRUTS");
		
		System.out.println(al);
		System.out.println(al.indexOf("SERVLETS"));
		int i= al.indexOf("SERVLETS");
		al.remove(i);
		al.add(i,"RESTPOOL SREVICES");
		System.out.println(al);
		al.set(i,"SERVLETS");
		
		/*al.remove(2);
		al.add(2,"N");
		al.add("md");*/
		System.out.println(al);
		
		al.add(2, "RAJA");
		System.out.println(al);
		
		al.remove("RAJA");
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
	}

}
