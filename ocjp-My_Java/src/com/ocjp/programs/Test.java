package com.ocjp.programs;

public class Test {

	/*public static void main(String[] args) {
		
		int w = (int)888.8;
		byte x = (byte)1000L;
		long y = (byte)100;
		byte z = (byte)100L;
		
		
		int I = 0;
	    outer:
	    while (true) 
	    {
	        I++;
	        inner:
	        for (int j = 0; j < 10; j++) 
	        {
	            I += j;
	            if (j == 3)
	                continue inner;
	            break outer;
	        }
	        continue outer;
	    }
	System.out.println(I);
	}*/
	
	/*public static void main(String [] args) 
    {
		Test s = new Test();
        s.start();
        
        
    }

    void start() 
    {
        int a = 3;
        int b = 4;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(a + b);
        System.out.print(" " + a + b + " ");
        System.out.print(foo() + a + b + " ");
        System.out.println(a + b + foo());
    }

    String foo() 
    {
        return "foo";
    }*/
	
	 boolean [] b = new boolean[3];
	    int count = 0;

	    void set(boolean [] x, int i) 
	    {
	        x[i] = true;
	        ++count;
	    }

	    public static void main(String [] args) 
	    {
	    	Test ba = new Test();
	        ba.set(ba.b, 0);
	        ba.set(ba.b, 2);
	        ba.test();
	    }

	    void test() 
	    {
	        if ( b[0] && b[1] | b[2] )
	            count++;
	        if ( b[1] && b[(++count - 2)] )
	            count += 7;
	        System.out.println("count = " + count);
	    }

}
