package com.java.coding.matrix;

public class Addition {
	public static void main(String[] args) {
		int row=3;
		int col=3;
		int matrix1[][]= new int[row][col]; 
		int matrix2[][]= new int[row][col]; 
		int num1=1;
		int num2=10;
		int sumMatrix[][]=new int[row][col];
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0; j<matrix1.length;j++) {
				matrix1[i][j]=num1;
				num1++;
			}
		}
		for(int i=0;i<matrix2.length;i++) {
			for(int j=0; j<matrix2.length;j++) {
				matrix2[i][j]=num2;
				num2++;
			}
		}
		for(int i=0;i<sumMatrix.length;i++) {
			for(int j=0; j<sumMatrix.length;j++) {
				
				sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<sumMatrix.length;i++) {
			for(int j=0; j<sumMatrix.length;j++) {
				
				System.out.print(sumMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
