package com.ocjp.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("ranjan");
		System.out.println(s);
		p.setProperty("ranjan", "88888");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "Update Ranjan data");
		System.out.println(p);
	}

}
