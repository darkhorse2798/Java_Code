package com.java.coding;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str=" h ello   hii     Hello ";
		StringBuilder builder =new StringBuilder();
		
		str=str.trim();
		int n=str.length(); //hello   hii Hello;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '){
				continue;
			}else {
				builder.append(str.charAt(i));
			}
		}
		System.out.println(builder.toString());
	}

}
