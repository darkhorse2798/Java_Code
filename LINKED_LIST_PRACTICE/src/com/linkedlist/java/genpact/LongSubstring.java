package com.linkedlist.java.genpact;

import java.util.Arrays;
import java.util.Comparator;

public class LongSubstring {
	
	public static void main(String[] args) {
		String str[]= {"spider","ant","man","spiderman","antman"};
		//o/p- spiderman,spider-man
		
		String op=Arrays.stream(str)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
//		System.out.println(op);
		
		 String res = op;
	        
	        if (Arrays.asList(str).contains("spider") && Arrays.asList(str).contains("man")) {
	        	res +=","+"spider-man";
	        }
	        System.out.println(res);
	
	}

}
