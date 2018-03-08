package com.ocjp.exceptionNew;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public void readFile() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Ranjan\\abc.txt"))) {
			String str = br.readLine();
			System.out.println(str);
		}
	}
}
