package com.tree.java;

public class ReverseString {
	   public static void main(String[] args) {
	      String str = "Nitesh Shaw";
	      int end = str.length() - 1;

	      System.out.println(reverse(str, 0, end));
	   }

	   private static String reverse(String str, int start, int end) {
	      if (start >= end) return str;

	      char[] charArray = str.toCharArray();
	      char temp = charArray[start];
	      charArray[start] = charArray[end];
	      charArray[end] = temp;

	      return reverse(new String(charArray), start + 1, end - 1);
	   }
	}
