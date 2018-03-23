package com.ocjp.programs;

import java.util.Scanner;

public class JavaPascalTriangle
{
    public static void main(String args[])
	{
	    int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(k=r; k>i; k--)
			{
				System.out.print(" ");
			}
            number = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
	
/*public static void main(String[] args) {
        
        int rows = 8;
        
        
        for(int i =0;i<rows;i++) {
            int number = 1;
            System.out.format("%"+(rows-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                 System.out.format("%4d",number);
                 number = number * (i - j) / (j + 1);
                
            }
            System.out.println();
        }
        
    }*/
}