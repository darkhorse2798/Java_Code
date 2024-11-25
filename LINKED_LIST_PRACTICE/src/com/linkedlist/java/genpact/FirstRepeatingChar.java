package com.linkedlist.java.genpact;

import java.util.*;

public class FirstRepeatingChar {
	
	public static void main(String[] args) {
		
		String str ="Nitesh Kumar Shaw Yes";
		
		
		System.out.println(fun(str));
		
		
		
		
		
	}
	public static char fun(String str) {
Map<Character,Integer> map = new LinkedHashMap<>();

		
		for(char num : str.toCharArray()) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		
//		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
//			if(entry.getValue()>1) {
//				return entry.getKey();
//			}
//		}
//		return '\0';
		
		return map.entrySet().stream().filter(entry -> entry.getValue() > 1).findFirst().map(Map.Entry::getKey)
				.orElse('\0');
	}

}
