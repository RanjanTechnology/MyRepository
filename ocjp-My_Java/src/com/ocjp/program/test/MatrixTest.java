package com.ocjp.program.test;

import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {

		//int[][] firstMatrix = { { 3, 4, 5 }, { 3, 4, 5 } };
		//int[][] secondMatrix = { { 3, 4, 5 }, { 3, 4, 5 } };

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows = s.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = s.nextInt();
		int[][] firstMatrix = new int[rows][columns];
		int[][] secondMatrix = new int[rows][columns];
		System.out.println("Enter the first matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				firstMatrix[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the second matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				secondMatrix[i][j] = s.nextInt();
			}
		}

		AddMatrixValue am = new AddMatrixValue();

		int[][] matrix = am.sumMatrix(firstMatrix, secondMatrix);

		System.out.println("Sum of two matrix: ");
		for (int[] row : matrix) {
			for (int column : row) {
				System.out.print(column + "  ");
			}
			System.out.println();
		}

	}

}
