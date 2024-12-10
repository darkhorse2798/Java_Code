package com.java.coding;

public class StrinContainDigit {
	public static void main(String[] args) {
		String str= "Nitesh ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=47 && str.charAt(i)<=57) {
				System.out.println("It contains digit");
				break;
			}
		}
	}

}
