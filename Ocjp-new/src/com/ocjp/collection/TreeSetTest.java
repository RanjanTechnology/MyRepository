package com.ocjp.collection;

import java.util.TreeSet;

public class TreeSetTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("A");
		ts.add("B");
		ts.add("Z");
		ts.add("L");
		ts.add("D");
		//ts.add(null);
		System.out.println(ts);
		
	//	ts.add(10);
		System.out.println(ts);
	}

}
