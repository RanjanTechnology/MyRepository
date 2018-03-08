package com.ocjp.collection;

import java.util.Comparator;

public class HashMapComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return str2.compareTo(str1);
	}

}
