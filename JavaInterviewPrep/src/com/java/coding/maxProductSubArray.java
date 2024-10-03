package com.java.coding;

public class maxProductSubArray {
	public static void main(String[] args) {
		int arr[]={-2, 6, -3, -10, 0, 2};

		System.out.println(maxProductSubArray(arr));
	}

	private static int maxProductSubArray(int[] arr) {
		
		int maxProduct=Integer.MIN_VALUE;
		int product =1;
		for(int nums : arr) {
			product*=nums;
			
			if(product==0) product=1;
			maxProduct= Math.max(maxProduct, product);
		}
		product=1;
		
		for(int i=arr.length-1;i>=0;i--){
			
             product*=arr[i];
			
			if(product==0) product=1;
			maxProduct= Math.max(maxProduct, product);
		}
		return maxProduct;
	}

}
