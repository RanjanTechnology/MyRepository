package com.ocjp.programs;

public class FindAlphabetChar {

	public static void main(String[] args) {
		
		String str = "s23dnv630d@#$j*&h?>937434d";
		int len = str.length();
		String result = "";
		char[] ch = str.toCharArray(); 
		for(int i = 0; i < len; i++){
			
			if((ch[i]>=65 && ch[i]<=91) || (ch[i]>=97 && ch[i]<=123)){
				result = result+ch[i];
			}
		}
		System.out.println("All alphabet charecter : "+result);
	}

}
