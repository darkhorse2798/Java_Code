package com.java.coding;

import java.util.PriorityQueue;

public class KthLargest {
	public static void main(String[] args) {
		int arr[]= {5,2,3,1,0,6,4};
		System.out.println(kthLargest(arr,3));
	}

	private static int kthLargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int num : arr) {
			pq.offer(num);
			
			if(pq.size()>k){
				pq.poll();
			}
		}
		
		return pq.peek();
		
	}
	
	

}
