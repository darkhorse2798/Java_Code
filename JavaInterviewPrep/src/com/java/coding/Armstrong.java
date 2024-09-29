package com.java.coding;

public class Armstrong {
	public static void main(String[] args) {
		int range=10000;
		for(int i=0; i<range;i++){
			if(i<10) continue;
			if(armstrong(i)) {
				System.out.print(i+ " ");
			}
		}
		
	}
	public static int pow(int rem,int count) {
		int pow=1;
	   for(int i=0;i<count;i++){
		   pow*=rem;
	   }
	   return pow;
	}

	private static boolean armstrong(int num) {
		int count=0;
		//153
		int result=num;
		while(result!=0) {
			result/=10;   //15/1/0
			count++;   //count=1/count=2/count=3;
		}
		result=num;
		int sum=0;
		while(num!=0) {
			int rem= num % 10;
			sum+=pow(rem, count);
			num/=10;
		}
		return sum==result;
		
	}

}
