package com.java.coding;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
	
	public static void main(String[] args) {
//		String str="Better Butter";
//		Map<Character,Integer> map= new HashMap<>();
//		Map<Character,Integer> result= new HashMap<>();
//		for(char arr : str.toCharArray() ){
//			if(arr==' ') continue;
//			map.put(arr, map.getOrDefault(arr, 0)+1);
//		}
//		int k;
//		map.forEach((key,value)->{
//			if(value>1) {
//				result.put(key, value);
//			}
//		});
//		
//		System.out.println(result);
		
		 String str = "Better Better";
	        int count[] = new int[256]; // 
	        
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ' ') continue;
	            count[str.charAt(i)]++; 
	        }

	        System.out.println("Count of each character is:");
	        for (int i = 0; i < count.length; i++) {
	            if (count[i] > 0) { 
	                System.out.println((char) i + ": " + count[i]);
	            }
	        }

}
}