package com.java.coding;

public class SecondLargest {
	
	public static void main(String[] args) {
		  int arr[] = {3, 3,3,3,3};

	        int max = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) {
	                secondMax = max; 
	                max = arr[i]; 
	            } else if (arr[i] > secondMax && arr[i] < max) {
	                secondMax = arr[i]; // Update secondMax
	            }
	        }

	        if (secondMax == Integer.MIN_VALUE) {
	            System.out.println("No second maximum value found.");
	        } else {
	            System.out.println("Second maximum value: " + secondMax);
	        }
	    }

}
