package com.java.coding;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDuplicate {
	public static void main(String[] args) {
		int array[]= {1,2,1,2,3,1,4,5,6,7};
	
		
//		usingHashMap(array);
		usingStream(array);
	}

	private static void usingStream(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());
        List<Integer> res = list.stream().filter(item -> list.indexOf(item)!=list.lastIndexOf(item)).distinct().collect(Collectors.toList());
        
        System.out.println(res);
//        System.out.println(set);
        
	}

	private static void usingHashMap(int[] array) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int arr:array ) {
			map.put(arr, map.getOrDefault(arr, 0)+1);
			
		}
	List<Integer>res=new ArrayList<>();
		map.forEach((key,value)->{
			if(value>1) {
				res.add(key);
			}
		});
		System.out.println(res);
	}

}
