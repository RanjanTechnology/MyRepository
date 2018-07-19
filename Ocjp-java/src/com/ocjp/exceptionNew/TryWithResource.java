package com.ocjp.exceptionNew;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public void readFile() throws IOException {
		try (FileReader fr = new FileReader("C:\\Ranjan\\abc.txt");BufferedReader br = new BufferedReader(fr)) {
			String str = br.readLine();
			System.out.println(str);
		}
	}
}
