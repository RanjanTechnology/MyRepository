package com.ocjp.collection;

import java.util.TreeSet;

public class TreeSetTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		//ts.add(null);
		ts.add("A");
		ts.add("B");
		ts.add("Z");
		ts.add("L");
		ts.add("D");
		
		System.out.println(ts);
		
	//	ts.add(10);
		System.out.println(ts);
	}

}
