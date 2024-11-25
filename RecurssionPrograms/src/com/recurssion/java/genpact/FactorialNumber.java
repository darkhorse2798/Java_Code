package com.recurssion.java.genpact;

public class FactorialNumber {
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		
		
	}
	public static int factorial(int num) {
		
		if(num==0) return 1; //F 
		
		return num*factorial(num-1); //1*factorial(0)
	}
	

}
// factorial(5)-->5*factorial(4)-->4*factorial(3)-->3*factorial(2)-->2*factorial(1)--> 1*factorial(0);
//                    5*4*3*2          4*3*2             3*2                 2*1                 1*1          