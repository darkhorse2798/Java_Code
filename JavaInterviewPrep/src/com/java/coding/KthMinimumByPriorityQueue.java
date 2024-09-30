package com.java.coding;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMinimumByPriorityQueue {

	 public static void main(String[] args) {
		int arr[]= {1,3,4,5,2};
		int k=3;
		int result=kthMimimumElement(arr,k);
		System.out.println(result);
	}

	private static int kthMimimumElement(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int num : arr) {
			pq.offer(num);
			
			if(pq.size()>k) {
				pq.poll();
			}
		}
		return pq.peek();
	}
}
