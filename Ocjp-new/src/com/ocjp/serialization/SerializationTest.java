package com.ocjp.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationTest {

	public static void main(String[] args) {
		
		System.out.println("Serialization Start ");
		Shop sp= new Shop();
		Dealer d= new Dealer();
		
		try {
			FileOutputStream fos= new FileOutputStream("c:\\Ranjan\\demo12.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(sp);
			oos.writeObject(d);
			
			oos.close();
			fos.close();
			System.out.println("Object has been serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Deserialization start");
		Shop sp1 = null;
		Dealer d1=null;
		try {
			FileInputStream fis = new FileInputStream("c:\\Ranjan\\demo12.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			sp1= (Shop)ois.readObject();
			d1= (Dealer)ois.readObject();
			
			fis.close();
			ois.close();
			System.out.println("Object has been deserialized");
			System.out.println("Item-----------------------------"+sp1.item);
			System.out.println("Cost-----------------------------"+sp1.cost);
			System.out.println("Dealer shop");
			System.out.println("Item-----------------------------"+d1.item);
			System.out.println("Cost-----------------------------"+d1.cost);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
