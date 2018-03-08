package com.ocjp.oops;

import java.io.UnsupportedEncodingException;

public class ByteToString {
    
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s="abcmnhiuwsduygdgsgdsga";
		System.out.println(s);
		byte[] b1= s.getBytes();
		System.out.println(b1);
		
		String s2= new String(b1, "UTF-8");
		System.out.println(s2);
		
		System.out.println(s.equals(s2));
		
	}
}
