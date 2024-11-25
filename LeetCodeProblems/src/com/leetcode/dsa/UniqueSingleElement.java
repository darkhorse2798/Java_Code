package com.leetcode.dsa;

public class UniqueSingleElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,10,1,2,5,3,6,7,8,9,8,9};
		int size=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			size^=arr[i];
			
		}
		
		System.out.println(size);
	}

}
