package com.ocjp.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("c:\\Ranjan\\ranjan1.txt", true);
		fw.write(100);
		fw.write('\n');
		fw.write("Mastercard is product base company");
		fw.write('\n');
		char[] c={'a','b','c'};
		fw.write(c);
		fw.flush();
		fw.close();
	}

}
