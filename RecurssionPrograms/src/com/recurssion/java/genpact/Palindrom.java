package com.recurssion.java.genpact;

public class Palindrom {
	
	public static void main(String[] args) {
		String input="racecar";
		String str=input.toLowerCase();
		
		
		System.out.println(palindrom(str,0,str.length()-1));
	}

	private static boolean palindrom(String str,int left,int right) {
		
		if(str==null || str.length()<=1) return true;
		if(str.charAt(left)!=str.charAt(right)) return false;
		if(left>=right) return true;
		
		return palindrom(str,left+1,right-1);
		
		
		
	}

}
