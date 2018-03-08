package com.ocjp.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:\\Ranjan\\demo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch={'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.write("Priyaranjan singh");
		bw.flush();
		bw.close();
	}

}
