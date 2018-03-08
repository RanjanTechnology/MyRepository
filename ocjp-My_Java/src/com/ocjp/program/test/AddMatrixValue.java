package com.ocjp.program.test;

public class AddMatrixValue {
	
	
	public int[][] sumMatrix(int[][] firstMatrix, int[][] secondMatrix){
		int row =2;
		int column =3;
		
		int[][] sum = new int[row][column];
		
		for(int i = 0; i<row;i++){
			for(int j=0;j<column;j++){
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		
		return sum;
	}
}
