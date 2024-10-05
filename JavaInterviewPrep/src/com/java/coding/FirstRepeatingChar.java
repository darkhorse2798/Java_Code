package com.java.coding;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingChar {
	public static void main(String[] args) {
		String str="geeksfor geek";
		System.out.println(countChar(str,2));
		
	}
	public static char countChar(String str,int n) {
       int count=0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
//		for(Map.Entry<Character, Integer> res : map.entrySet()){
//			if(res.getValue()>1) {
//				count++;
//				if(count==n) {
//					return res.getKey();
//					
//				}
//			}
//		}
		
		for(char ch : str.toCharArray()) {
			if(map.get(ch)>1) {
				count++;
				if(count==n) {
					return ch;
				}
			}
		}
		return '_';
	}

}
