package com.recurssion.java.genpact;


//0 1 1 2 3 5
public class Fibonaaci {
	public static void main(String[] args) {
		System.out.println(fibonaaci(5));
		
	}

	
	private static int fibonaaci(int n) {
		if(n<=1) return n;
		
		
		return fibonaaci(n-1)+fibonaaci(n-2);
	}

}
