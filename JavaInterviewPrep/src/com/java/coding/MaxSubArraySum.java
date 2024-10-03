package com.java.coding;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int arr[]= {5,4,-1,7,8};
		System.out.println(maxSumSubArrays(arr));
	}

	private static int maxSumSubArrays(int[] arr) {
		int maxSubArray=Integer.MIN_VALUE;
		int sum=0;
		for(int num : arr) {
			sum+=num;
			maxSubArray=Math.max(maxSubArray, sum);
			if(sum<0)  sum=0;
		}
		
		return maxSubArray;
	}

}
