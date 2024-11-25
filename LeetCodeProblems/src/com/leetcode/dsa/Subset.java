package com.leetcode.dsa;

import java.util.ArrayList;
import java.util.List;

public class Subset {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		List<List<Integer>> res = new ArrayList<>();
		System.out.println(subSet(arr,res));
		
	}
	public static List<List<Integer>> subSet(int arr[],List<List<Integer>> res){
		
		res.add(new ArrayList<>());
		for(int num : arr) {
			int size=res.size();
			for(int j=0;j<size;j++){
				  List<Integer> temp = new ArrayList<>(res.get(j));
				  temp.add(num);
				  res.add(temp);

			}
			
		}
		return res;
		
	}

}
