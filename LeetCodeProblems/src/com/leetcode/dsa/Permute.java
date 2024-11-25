package com.leetcode.dsa;

import java.util.*;

public class Permute {

    public static void main(String[] args) {
        String s = "abc";
        int left = 0;
        int right = s.length() - 1;
        List<String> permutations = permuataioon(s, left, right);
        System.out.println(permutations); // Print all permutations
    }

    private static List<String> permuataioon(String s, int left, int right) {
        List<String> res = new ArrayList<>(); // List to store results
        if (left == right) {
            res.add(s);
            return res;
        }
        for (int i = left; i <= right; i++) {
            s = swap(s, left, i); // Swap characters
            res.addAll(permuataioon(s, left + 1, right)); 
            s = swap(s, left, i); // Backtrack
        }
        return res;
    }

    private static String swap(String s, int left, int right) {
        char[] charArray = s.toCharArray();
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        return new String(charArray);
    }
}
