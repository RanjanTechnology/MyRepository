package com.ocjp.security;

import java.io.UnsupportedEncodingException;

import javax.xml.bind.ValidationException;

public class PBKDF2Test {

	 private static final String ALGORITHM = "PBKDF2WithHmacSHA1";
	public static void main(String[] args) throws ValidationException, UnsupportedEncodingException {
		
		String password = "Admin@123";
		System.out.println(password);
		char[] message= password.toCharArray();
		String s= "1234345678";
		byte[] salt = s.getBytes();
		String n = new String(salt);
		System.out.println(n);
		int iterations= 10000;
		int keyLength = 256;
		//String pseudoRandomFunction = "PBKDF2WithHmacSHA1";
		String newPassword =	PBKDF2Hashing.hash1(message, salt, iterations, keyLength, ALGORITHM);
	    
	   // String stringPassword = new String(newPassword,"UTF-8");
	    
	    System.out.println(newPassword);
	    
	}

}
