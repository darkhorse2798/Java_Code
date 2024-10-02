package com.java.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatingChar{
	public static void main(String[] args) {
		String str="Niteshh";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()){
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		List<Character> list = new ArrayList<>();
		List<Character> result1 = new ArrayList<>();
		map.forEach((key,value)->{
			
			if(value==1) {
				list.add(key);
			}
		});
		for(Character ch : list) {
			int index= str.indexOf(ch);
			if(index!=-1){
				result1.add(ch);
				
			}
		}
		System.out.println(result1);
	}

}
