package com.java.coding.matrix;

public class Subtraction{
    int row = 3;
    int col = 3;
    int matrix1[][] = new int[row][col];
    int matrix2[][] = new int[row][col];
    int num1 = 1;
    int num2 = 10;

    int diffMatrix[][] = new int[row][col];

    public void performMatrixSubtraction() {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = num1;
                num1++;
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix2[i][j] = num2;
                num2++;
            }
        }

        for (int i = 0; i < diffMatrix.length; i++) {
            for (int j = 0; j < diffMatrix[0].length; j++) {
                diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j];  
            }
        }

        for (int i = 0; i < diffMatrix.length; i++) {
            for (int j = 0; j < diffMatrix[0].length; j++) {
                System.out.print(diffMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Subtraction sub = new Subtraction();
        sub.performMatrixSubtraction();
    }
}
