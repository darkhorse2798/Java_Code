package com.linkedlist.java.genpact;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1,0,-1};
	  
		mergeSort(arr,0,arr.length-1);
		
		
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int left, int right) {
		
		if(left<right) {
			int mid=left+(right-left)/2;
			mergeSort(arr,0,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);

		}
		
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int[] temp=new int[arr.length];
		int i=left;
		int j=mid+1;
		int k=left;
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];
			}
			else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=right) {
			temp[k++]=arr[j++];
		}
		
		for( k =left;k<=right;k++) {
		arr[k]=temp[k];
		}
		
	}

}
