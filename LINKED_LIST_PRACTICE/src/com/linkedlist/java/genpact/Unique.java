package com.linkedlist.java.genpact;

public class Unique {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,3,4,4};
		int num=arr[0];
		for(int i=1;i<arr.length;i++) {
			num^=arr[i];
		}
		System.out.println(num);
	}

}
