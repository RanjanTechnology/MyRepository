package com.ocjp.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		//Step1----------------------
		/*File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		f.mkdir();*/
		
		//Step2
		/*File f = new File("xyz.txt");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());*/
		
		//step3
		/*File f = new File("Priyaranjan");
		f.mkdir();
		File f2 = new File("Priyaranjan", "abc1.txt");
		f2.createNewFile();
		System.out.println(f2.exists());*/
		
		File f = new File("c:\\Ranjan", "ranjan1.txt");
		f.createNewFile();
		
		System.out.println(f.getPath());
		System.out.println(f);
	}

}
