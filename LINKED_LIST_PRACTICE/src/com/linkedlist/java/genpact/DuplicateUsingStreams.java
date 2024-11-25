package com.linkedlist.java.genpact;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateUsingStreams {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 3};
		           //

		  List<Integer> list = Arrays.stream(arr)
                  .boxed()  
                  .collect(Collectors.toList());

  List<Integer> dupli= list.stream()
 .filter(i -> list.indexOf(i) == list.lastIndexOf(i))  
 .distinct()  
 .collect(Collectors.toList());  

	        System.out.println(dupli);
		
		
	}

}
