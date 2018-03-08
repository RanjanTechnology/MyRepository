package com.ocjp.files;

import java.io.File;

public class FileName {

	public static void main(String[] args) {
		File file = new File("c:\\Ranjan");
		String[] f=file.list();
		for(String str : f){
			File f1= new File(file, str);
			if(f1.isFile())
			System.out.println(str);
		}
	
	}

}
