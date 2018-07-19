package com.ocjp.program.test;

public class AddTwoArryanOneRow {
	
	public int[] sumRow(int[] firstMatrix, int[] secondMatrix ,int c){
				
		int[] sum = new int[firstMatrix.length];
		
		for(int i=0; i<=firstMatrix.length-1;i++){
			sum[i] = firstMatrix[i]+secondMatrix[i];
		}
		
		return sum;
	}
}
