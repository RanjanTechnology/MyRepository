package com.ocjp.program.test;

public class PramitiveDataTest {

	/* public static void main(String args[]) { 
	       String x = null; 
	       giveMeAString(x); 
	       System.out.println(x); 
	    } 
	    static void giveMeAString(String y) 
	    { 
	       y = "GeeksQuiz"; 
	    } */
	    
	    
	    /*public static void swap(Integer i, Integer j) {
	        Integer temp = new Integer(i);
	        i = j;
	        j = temp;
	     }
	     public static void main(String[] args) {
	        Integer i = new Integer(10);
	        Integer j = new Integer(20);
	        swap(i, j);
	        System.out.println("i = " + i + ", j = " + j);
	     }*/
	 public void demo(String str)
	    {
	        String[] arr = str.split(";");
	        for (String s : arr)
	        {
	            System.out.println(s);
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        /*char array[] = {'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ', 
	                        'g', 'h', ';', 'i', 'j', ' ', 'k', 'l'};
	        String str = new String(array);
	        PramitiveDataTest obj = new PramitiveDataTest();
	        obj.demo(str);*/
	    	
	    	
	    	int j = 5;
	    	  for (int i = 0; i< j; i++)
	    	  {
	    	    if ( i <= j-- )
	    	       System.out.print(  (i*j)  + " ");
	    	  }
	    }

}

