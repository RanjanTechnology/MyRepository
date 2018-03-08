package com.ocjp.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		int count=0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbaabbbaabaabbbb");
		while(m.find()){
			count++;
			System.out.println(m.start()+"------------"+m.end()+"------------"+m.group());
		}
		System.out.println("No of occurences: "+count);
	}

}
