package com.recurssion.java.medium;

public class BinarySerach {
	public static void main(String[] args) {
		int arr[]= {2,4,5,8,9,10,12,13};
		int target=24;
		
		System.out.println(binarySearch(arr,target,0,arr.length-1));
		
	}

		    private static int binarySearch(int[] arr, int target, int start, int end) {
		        if (start > end) {
		            return -1;
		        }

		        int mid = start + (end - start) / 2;  
		        
		        if (arr[mid] == target) {
		            return mid; 
		        } else if (arr[mid] > target) {
		            return binarySearch(arr, target, start, mid - 1); 
		        } else {
		            return binarySearch(arr, target, mid + 1, end); 
		        }
		    }
	
	}
