package com.leetcode.dsa;

import java.util.*;

public class SubSetBackTrack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        List<List<Integer>> resultList = subSetBackTrack(arr);
        System.out.println(resultList);
    }

    private static List<List<Integer>> subSetBackTrack(int[] arr) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(resultList, new ArrayList<>(), arr, 0);
        return resultList;
    }

    private static void backtrack(List<List<Integer>> resultList, 
                                   List<Integer> tempList, 
                                   int[] arr, 
                                   int start) {
    	
    	if(resultList.contains(tempList)) return;
        resultList.add(new ArrayList<>(tempList));

        for (int i = start; i < arr.length; i++) {
            tempList.add(arr[i]);
            
            backtrack(resultList, tempList, arr, i + 1);
            
            tempList.remove(tempList.size() - 1);
        }
    }
}