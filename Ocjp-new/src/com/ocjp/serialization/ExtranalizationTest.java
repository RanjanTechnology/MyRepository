package com.ocjp.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExtranalizationTest {

	public static void main(String[] args) throws Exception {
		
		ExternalDemo exd = new ExternalDemo("Ranjan", 10, 20);
		
		FileOutputStream fos= new FileOutputStream("c:\\Ranjan\\external.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(exd);
		
		FileInputStream fis = new FileInputStream("c:\\Ranjan\\external.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalDemo sp1= (ExternalDemo)ois.readObject();
		System.out.println(sp1.s+"-----------"+sp1.i+"----------"+sp1.j);
	}

}
