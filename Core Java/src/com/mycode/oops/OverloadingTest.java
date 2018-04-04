package com.mycode.oops;

public class OverloadingTest {

	public static void main(String[] args) {
		
		DifferentNumberOverloading ol = new DifferentNumberOverloading();
		
		System.out.println(ol.add(10, 20));
		System.out.println(ol.add(10l, 20));
		System.out.println(ol.add(10, 20l));
	}

}
