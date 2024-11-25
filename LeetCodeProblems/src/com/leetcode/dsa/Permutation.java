package com.leetcode.dsa;

import java.util.*;

public class Permutation {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		List<List<Integer>> resultList = new ArrayList<>();
		backTrack(resultList,new ArrayList<>(),arr);
		System.out.println(resultList);
	}

	private static void backTrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] arr) {
		if(tempList.size()==arr.length) {
			resultList.add(new ArrayList<>(tempList));
			return;
		}
		for(int num : arr) {
			
			if(tempList.contains(num)) continue;
			
			tempList.add(num);
			
			backTrack(resultList,tempList,arr);
			
			tempList.remove(tempList.size()-1);

			
		}
		
	}

}
