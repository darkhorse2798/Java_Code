package com.leetcode.dsa;

public class ValiidShuffle {
	public static void main(String[] args) {

		
		System.out.println(validShuffle("abc", "def", "abcdef"));  // true
        System.out.println(validShuffle("abc", "def", "abedcf"));  // true
        System.out.println(validShuffle("abc", "def", "adbecf"));  // true
        System.out.println(validShuffle("abc", "def", "adbfce"));  // false 

//a b c // d e f // a b d e c f
// i i i i j j j k k k k k k

//		System.out.println(validShuffle(str1, str2, shuffle));
	}

	public static boolean validShuffle(String str1, String str2, String shuffle) {
		if (str1.length() + str2.length() != shuffle.length())
			return false;

		int i = 0, j = 0, k = 0;
		while (k < shuffle.length()) {
			if (i < str1.length() && str1.charAt(i) == shuffle.charAt(k)) {
				i++;
			} else if (j < str2.length() && str2.charAt(j) == shuffle.charAt(k)) {
				j++;
			} else {
				return false;

			}
			k++;

		}
		return i == str1.length() && j == str2.length();
	}

}