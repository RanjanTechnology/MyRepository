package com.ocjp.program.test;

public class TwoArrayAdditionTest {

	public static void main(String[] args) {
		
		int[] firstMatrix = {3,4,5};
		int[] secondMatrix = {3,4,5};
		
		AddTwoArryanOneRow ta = new AddTwoArryanOneRow();
		 int[] sumArray = ta.sumRow(firstMatrix, secondMatrix);
		 
		 System.out.println("Sum of two Array: ");
		 System.out.print("{");
		 for(int i=0; i<=sumArray.length-1; i++)
			 System.out.print(sumArray[i]+" ");
		 
		 System.out.print("}");
	}

}
