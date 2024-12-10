package com.recurssion.java.genpact;

public class GCD {
	public static void main(String[] args) {
//		System.out.println(gcd(24));
		System.out.println(gcd(24,2,0));
		
		
	}
	
	private static int gcd(int num,int i,int ans){
		
		if(i>num/2) return ans;
		ans= num % i == 0 ? i : ans;
		
		return gcd(num,i+1,ans);
		
		
}
	

//	private static int gcd(int num) {
//		int max=0;
//		for(int i =2;i<=num/2;i++) {
//			if(num % i==0) {
//				if(i>max) {
//					max=i;
//				}
//				
//			}
//			
//		}
//		
//		return max;
//		
//		
//	}
	

}
