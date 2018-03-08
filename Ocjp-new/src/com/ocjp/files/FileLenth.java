package com.ocjp.files;

import java.io.File;

public class FileLenth {

	public static void main(String[] args) {
		int count=0;
		File file = new File("c:\\Ranjan");
		String[] f=file.list();
		for(String str : f){
			count++;
			System.out.println(str);
		}
		System.out.println("Total file: "+count);
	}

}
