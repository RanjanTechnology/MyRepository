package com.ocjp.oops;

public class StrinToFloat {

	public static void main(String[] args) {
		String str = "10,120.09";
		String str1 = str.replaceAll(",", "");
		float f = Float.valueOf(str1);
		System.out.println(f);
	}

}
