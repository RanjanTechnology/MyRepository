package com.ocjp.program.test;

import java.util.regex.Pattern;

public class CountVowel {
	
	public static void main(String[] args) {
		
		String str = "Programming";
		String result = "";
		int vowel = 0;
		int consonents = 0;
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
		if (Pattern.matches("[aeiou]", Character.toString(c))){
			vowel++;
			result = result + Character.toString(c);
		}
		else {
		consonents++;
		}
		}
		System.out.println(vowel+" "+consonents);
		
		System.out.println("Vowel char: "+result);
		}


	
}