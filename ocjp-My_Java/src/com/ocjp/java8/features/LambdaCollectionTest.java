package com.ocjp.java8.features;

import java.util.ArrayList;
import java.util.List;

public class LambdaCollectionTest {
	
	public static void main(String[] args) {       
	       List<String> list=new ArrayList<String>();  
	       list.add("Rick");         
	       list.add("Negan");       
	       list.add("Daryl");         
	       list.add("Glenn");         
	       list.add("Carl");                
	       list.forEach(
	    		// lambda expression
	    		   (names)->System.out.println("Name of person: "+names)
	    		   
	    		   );     
	    }  
}
