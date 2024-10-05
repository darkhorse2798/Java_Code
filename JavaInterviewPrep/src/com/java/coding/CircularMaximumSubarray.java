package com.java.coding;

public class CircularMaximumSubarray {
	public static void main(String[] args) {
		
		int arr[]= {5, -3, 5};
		int maxSubarray= kadensMax(arr);
		int minSubArray= kadensMin(arr);
		int totalSum=0;
		for(int num : arr) {
			totalSum+=num;
		}
		if(totalSum==minSubArray) {
			System.out.println(maxSubarray);
			return;
		}
		int circularMax=totalSum-minSubArray;
		
        System.out.println(Math.max(maxSubarray, circularMax));

//		System.out.println(circularMax);
		
	}

	private static int kadensMax(int[] arr) {
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int num : arr) {
			sum+=num;
			
			maxSum=Math.max(maxSum, sum);
			if(sum<0) sum=0;
		}
		
		return maxSum;
	}

	private static int kadensMin(int[] arr) {
		// TODO Auto-generated method stub
		int minSum=Integer.MAX_VALUE;
		int sum=0;
		for(int num : arr) {
			sum+=num;
			
			minSum=Math.min(minSum, sum);
			if(sum>0) sum=0;
		}
		
		return minSum;
	}

}
