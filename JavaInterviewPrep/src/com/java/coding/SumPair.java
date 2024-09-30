package com.java.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumPair {
	public static void main(String[] args) {
		int arr[]= {2,3,7,13,12,9,15,5};
		Map<Integer,Integer> map = new HashMap<>();
		int target=20;
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<arr.length;i++) {
			int result =target-arr[i];
			if(map.containsKey(result)){
				 List<Integer> pair = new ArrayList<>();
	                pair.add(map.get(result));
	                pair.add(i);
	                list.add(pair);
			}
			map.put(arr[i], i);
		}
		System.out.println(list);
	}
	
	

}
