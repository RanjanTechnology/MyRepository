package com.ocjp.programs;

import java.util.TreeMap;

public class TreeTest extends java.util.TreeSet
{
    public static void main(String [] args) 
    {	
    	int i = 0, j = 5; 
    	tp: for (;;) 
    	    {
    	        i++;  
    	        for (;;) 
    	        {
    	            if(i > --j) 
    	            {
    	                break tp; 
    	            } 
    	        } 
    	    }
    	        System.out.println("i =" + i + ", j = " + j);
    	
        java.util.TreeSet t = new java.util.TreeSet();
        t.clear();
        
        String a = "newspaper";
        a = a.substring(5,7);
        char b = a.charAt(1);
        a = a + b;
        System.out.println(a);
    }
    public void clear() 
    {
        TreeMap m = new TreeMap();
        m.clear();
    }
}