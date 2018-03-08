package com.ocjp.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		LinkedList lk = new LinkedList();
		lk.add("Baala");
		lk.add("Venki");
		lk.add("Chiru");
		lk.add("Naag");
		lk.add("Ranjan");
		
		System.out.println(lk);
		
		ListIterator ltr = lk.listIterator();
		while(ltr.hasNext()){
			String s = (String)ltr.next();
			if(s.equals("Venki")){
				ltr.remove();
			}
			if(s.equals("Chiru")){
				ltr.add("Chaitu");
			}
			if(s.equals("Naag")){
				ltr.set("Charan");
			}
			
		}
		System.out.println(lk);
		
	}

}
