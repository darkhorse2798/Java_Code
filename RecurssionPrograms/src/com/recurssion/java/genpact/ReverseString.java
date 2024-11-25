package com.recurssion.java.genpact;

public class ReverseString {
	public static void main(String[] args) {
		String str="Nitesh  Shaw";
		StringBuilder empty= new StringBuilder();
		
		System.out.println(reverse(str,empty,str.length()-1));
		
	}

	private static String reverse(String str,StringBuilder empty,int last) {
		
		if(last<0) return empty.toString();
		
		return reverse(str,empty.append(str.charAt(last)),last-1);
		
	}

}
