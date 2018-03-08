package com.ocjp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for(int i=1; i<=10; i++){
			al.add(i);
		}
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Integer in = (Integer)itr.next();
			if(in%2 == 0){
				System.out.println(in);
			}else{
				itr.remove();
			}
		}
		
		System.out.println(al);
	}

}
