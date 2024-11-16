package com.leetcode.dsa;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
	public static void main(String[] args) {
		
		String up="abcd";
		String p="";
		System.out.println(subsequence(p,up));
		
	}
  public static List<String> subsequence(String p,String up){
	  if(up.isEmpty()) {
		  List<String> res = new ArrayList<>();
		  res.add(p);
		  return res;
	  }
	  char ch = up.charAt(0);
	  List<String> left = subsequence(p+ch,up.substring(1));
	  List<String> right = subsequence(p,up.substring(1));
	  
	  left.addAll(right);
	  return left;
	  
  }
}
