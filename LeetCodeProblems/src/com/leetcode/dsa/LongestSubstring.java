package com.leetcode.dsa;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	
	public static void main(String[] args){
		String s="abcabcbb";
		
		System.out.println(lengthOfLongestSubstring(s));
	}
	 public static int lengthOfLongestSubstring(String s) {
	      Map<Character, Integer> hashMap = new HashMap<>();
	int right = 0;
	int maxLength = 0;
	int left = 0;
	// abcabcbb
	while (right < s.length()) {
	    int idx = hashMap.getOrDefault(s.charAt(right), -1);
	    //a b c a b c b b
	   // 0 1 2 3 4 5 6 7  
	    if (idx >= left) {  //
	        left = idx + 1;
	    }
	    maxLength = Math.max(maxLength, right - left + 1);
	    hashMap.put(s.charAt(right), right);
	    right++;
	}

	return maxLength;
	    
}
	//   public static int lengthOfLongestSubstring(String s) {
//	         int maxLength = 0;
	        
//	        for (int i = 0; i < s.length(); i++) {
//	          Set<Character> subString = new HashSet<>(); 
//	              for (int j = i; j < s.length(); j++) {
//	                  char currentChar = s.charAt(j);
	                
//	                 if (subString.contains(currentChar)) {
//	                      break; 
//	                  } else {
//	                      //aabcadcbb  //
	                    
//	                     //a b c a
//	                    subString.add(currentChar); 
//	                    maxLength = Math.max(maxLength, subString.size()); 
//	                }
//	             }
//	      }
//	         return maxLength;
//	     }
}
