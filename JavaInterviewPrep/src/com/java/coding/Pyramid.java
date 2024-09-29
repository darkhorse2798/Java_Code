package com.java.coding;

public class Pyramid {
	public static void main(String[] args) {
		int row=7;
		for(int i=0;i<row;i++) {
			for(int j=row-i-2;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i;k++) {
				System.out.print((k+1)+ " ");
				
			}
			System.out.println();
		}
	}

}
