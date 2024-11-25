package com.recurssion.java.genpact;

public class PrintNaturalNumbers {
	
	public static void main(String[] args) {
		printNumbers(1);
	}

	private static void printNumbers(int num) {
		if(num>10) return;
		
		System.out.print(num+" ");
		
		printNumbers(num+1);
        
		
	}

}
