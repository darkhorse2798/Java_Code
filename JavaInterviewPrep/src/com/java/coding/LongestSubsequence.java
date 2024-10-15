package com.java.coding;


public class LongestSubsequence {
	public static void main(String[] args) {
		
		int arr[]= {3,4,-1, 0,6,2,3};
		         //{0,0, 0, 0,0,0,0};
		     //     j         i
		
		int count[]= new int[arr.length];
		for(int i=1; i<arr.length;i++) {
			
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					 if(count[j]+1>count[i]) {
						 count[i]=count[j]+1;
					 }
				}
				
			}
		}
		int maxLength=0;
		for(int i=0; i<count.length;i++) {
			if(count[i]>maxLength) {
				maxLength=i;
			}
		}
		System.out.println(count[maxLength]+1);
	}

}
