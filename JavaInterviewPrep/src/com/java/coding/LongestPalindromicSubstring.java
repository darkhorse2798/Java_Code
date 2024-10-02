package com.java.coding;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		
		System.out.println(longestPalindromicSubstring("babad"));
		
		
		
		
	}

	private static String longestPalindromicSubstring(String string) {
		String res="";
	       for(int i=1;i<string.length();i++) {
	    	   int low=i;
	    	   int high=i;
	    	   //a b b a b a a a b a b c a b
	    	   while(string.charAt(low)==string.charAt(high)) {
	    		   low--;
	    		   high++;
	    		  	    		   if(low==-1 || high==string.length()) {
	    			   break;
	    		   }
	    	   }
	    	   String palindromString = string.substring(low+1,high);
    		   if(res.length()<palindromString.length()) {
    			   res=palindromString;
    		   }

	    	   low=i-1;
	    	   high=i;
	    	   while(string.charAt(low)==string.charAt(high)) {
	    		   low--;
	    		   high++;
	    		    palindromString = string.substring(low+1,high);
	    		   if(res.length()<palindromString.length()) {
	    			   res=palindromString;
	    		   }
	    		   if(low==-1 || high==string.length()) {
	    			   break;
	    		   }
	    	   }
	       }
	       return res;
		
	}
	

}
