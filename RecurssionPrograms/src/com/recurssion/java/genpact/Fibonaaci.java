package com.recurssion.java.genpact;


//0 1 1 2 3 5 8
public class Fibonaaci {
	public static void main(String[] args) {
		System.out.println(fibonaaci(6));
		
	}

	
	private static int fibonaaci(int n) {
		if(n<=1) return n; //0 1
		
		
		return fibonaaci(n-1)+fibonaaci(n-2);
	}

}
