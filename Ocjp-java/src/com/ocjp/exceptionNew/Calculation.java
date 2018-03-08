package com.ocjp.exceptionNew;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Calculation {
	int a = 10;

	public void div(){
		try {
			int c = a / 0;
			PrintWriter pr = new PrintWriter("abc.txt");
		} catch (ArithmeticException | FileNotFoundException e) {
			throw new BusinessException("BusinessException: Div by o is not applicable");
		}
	}

	public void findFile() throws Business {
		try {
			PrintWriter pr = new PrintWriter("abc.txt");
			pr.println("Hello");
		} catch (Exception e) {
			throw new Business("File is not avalable");
		}
	}
}
