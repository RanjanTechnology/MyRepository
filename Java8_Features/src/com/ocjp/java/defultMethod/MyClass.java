package com.ocjp.java.defultMethod;

import java.util.Collections;
import java.util.List;

public class MyClass implements MyInteface {

	@Override
	public int getMaxNumber(List<Integer> lists) {
		Integer result = Collections.max(lists);
		return result;
	}

}
