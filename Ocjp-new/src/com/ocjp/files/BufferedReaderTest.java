package com.ocjp.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\Ranjan\\demo.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
	}
}
