package com.java.coding;

import java.util.Arrays;

public class SumOfAllDigit {
	public static void main(String[] args) {
		String str="2345532";
		StringBuilder builder = new StringBuilder();
		char arr[]=str.toCharArray();
		
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
	     builder.append(arr[i]);
		}
		System.out.println(builder.toString());
	}

}
