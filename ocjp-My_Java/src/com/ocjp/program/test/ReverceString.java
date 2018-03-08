package com.ocjp.program.test;

public class ReverceString {
	
	public String reverce(String str){
		
		String reverc = "";
		
		for(int i=str.length()-1; i>=0;i--){
			
			reverc = reverc+str.charAt(i);
		}
		
		return reverc;
	}
	
}
