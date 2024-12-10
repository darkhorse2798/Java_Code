package com.java.coding;

public class MaxAndMin {
	public static void main(String[] args) {
		int arr[]= {1,2,0,-1,10,5,6,-11};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
