package com.recurssion.java.genpact;

public class SumOfAllNaturalNumbers {
	
	public static void main(String[] args) {
		System.out.println(sumOfNaturalNumbers(3,1,0));
		
	}

	private static int  sumOfNaturalNumbers(int num,int i,int sum) {
		if(i>num) return sum;
		
	return sumOfNaturalNumbers(num,i+1,sum+i);
		
	}

}

/*-->sumOfNaturalNumbers(3,1,0))
-->sumOfNaturalNumbers(3,2,0+1)
-->sumOfNaturalNumbers(3,1,1+2)
-->sumOfNaturalNumbers(3,1,3+3)*/  