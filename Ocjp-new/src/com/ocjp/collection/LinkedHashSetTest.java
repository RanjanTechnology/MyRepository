package com.ocjp.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedHashSet =new LinkedHashSet<>();
		linkedHashSet.add("Ranjan");
		linkedHashSet.add(null);
		linkedHashSet.add("Singh");
		linkedHashSet.add("Ranjan");
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
	}

}
