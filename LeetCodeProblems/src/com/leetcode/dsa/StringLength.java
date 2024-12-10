package com.leetcode.dsa;

public class StringLength {
	public static void main(String[] args) {
		String str="Nitesh Shaw";
		int i=0;
		int length=0;
		try {
			while(true) {
				str.charAt(i);
				i++;
				length++;
				
			}
			
		} catch (Exception e) {
			System.out.println(length);
		}
	}

}
