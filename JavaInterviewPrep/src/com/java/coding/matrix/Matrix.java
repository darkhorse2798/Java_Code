package com.java.coding.matrix;

public class Matrix {
	public static void main(String[] args) {
		int row=3;
		int col=3;
		int [][] matrix = new int[row][col];
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		int num=1;
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix.length;j++) {
				matrix[i][j]=num;
				num++;
				
			}
//			System.out.println();
		}
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

}
