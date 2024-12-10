package com.recurssion.java.genpact;

public class PowerOfANumber {
	public static void main(String[] args) {
		
		System.out.println(poweOfANumber(5,3,1));
		
	}

	private static int poweOfANumber(int base, int power,int res) {
		
//		for(int i=1; i<=power;i++) {
//			res*=base;
//		}
//		
//		return res;
		
	
		if(power==0) return res;
		
		
		return poweOfANumber(base,power-1,res*base);
		
	}

}
