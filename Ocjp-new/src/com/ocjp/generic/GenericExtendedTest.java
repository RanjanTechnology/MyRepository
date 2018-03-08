package com.ocjp.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExtendedTest {
 
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		
		int total = add(al);
		System.out.println(al);
		System.out.println(total);
	}
	
	public static int add(List<? extends Number> list){
		
		int sum = 0;
		
		for(Number n : list){
			sum+=n.intValue();
		}
		
		return sum;
	}

}
