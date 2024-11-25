package com.linkedlist.java.genpact;

import java.util.Arrays;
import java.util.List;

public class NumberStaringWithOne {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,8,98,32,15);
		
		list.stream().map( s-> s+" ").filter(s-> s.startsWith("1")).forEach(System.out::println);
	}

}
