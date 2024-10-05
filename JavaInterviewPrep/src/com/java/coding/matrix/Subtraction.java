package com.java.coding.matrix;

public class Subtraction{
    

    public static void main(String[] args) {
        Subtraction sub = new Subtraction();
        int matrix1[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][]= {{4,5},{7,8},{9,10}};
        
        int result[][]= new int[3][2];
        
        for(int i=0; i<3;i++) {
        	int sum=0;
        	for(int j=0;j<2;j++) {
        		for(int k=0; k<3;k++) {
        			
        			sum+=matrix1[i][k]*matrix2[k][j];
        		}
        		result[i][j]=sum;
        	}
        }
        for(int i=0; i<3;i++) {
        	for(int j=0;j<2;j++) {
        		System.out.print(result[i][j]+" ");
        		
        	}
        	System.out.println();
        }
    }
}
