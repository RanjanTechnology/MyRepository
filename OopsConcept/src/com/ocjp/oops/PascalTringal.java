package com.ocjp.oops;


public class PascalTringal {
      
       
	public static void main(String[] args) {
		 int number=1;
		for(int i=1;i<=6;i++){
		
			for(int j=1;j<=i;j++){
				
				System.out.println(number);
				number=1;
				number= number*(i-j)/(j+1);
			}
			
		}
	}
}
