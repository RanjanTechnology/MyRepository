package com.ocjp.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Ranjan\\ranjan1.txt");
		FileReader fr=new FileReader(f);
		char[] ch= new char[(int)f.length()];
		fr.read(ch);
		for(char c : ch){
			System.out.print(c);
		}
		System.out.println();
		System.out.println("*******************************************************************************");
		
		FileReader fr1 = new FileReader("c:\\Ranjan\\ranjan1.txt");
		int i= fr1.read();
		while(i!=-1){
			System.out.print((char)i);
			i=fr1.read();
		}
		
	}

}
