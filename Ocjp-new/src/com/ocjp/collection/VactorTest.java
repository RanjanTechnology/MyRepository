package com.ocjp.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VactorTest {

	public static void main(String[] args) {
		
		Vector vl = new Vector();
		System.out.println(vl.isEmpty());
		
		/*vl.addElement("ranjan");
		vl.addElement("Rakesh");
		vl.addElement("ABC");
		vl.addElement(10);
		System.out.println(vl);
		System.out.println(vl.firstElement());*/
		
		for(int i=1;i<=10;i++){
			vl.addElement(i);
		}
		System.out.println(vl);
		
		Enumeration e = vl.elements();
		while(e.hasMoreElements()){
			Integer in = (Integer)e.nextElement();
			if(in%2 == 0){
				System.out.println(in);
			}
		}
		System.out.println(vl);
	}

}
