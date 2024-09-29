package com.java.coding;

import java.util.Arrays;

public class EqualityOfAnArray {
	public static void main(String[] args) {
		int[] arrayOne = {2, 5, 1, 7, 4};
	    
	    int[] arrayTwo = {2,5, 1, 8, 4};
//	    
//	    if(arrayOne.length!=arrayTwo.length) {
//	    	System.out.println("The given Two Arrays are not equal");
//	    	return;
//	    	
//	    }
//	    for(int i=0; i<arrayOne.length;i++) {
//	    	if(arrayOne[i]!=arrayTwo[i]) {
//	    		System.out.println("Arrays are not equal");
//	    		return;
//	    	}
//	    }
//	    
//	    System.out.println("Arrays are equal");
//	    
	    System.out.println(inBuilt(arrayOne,arrayTwo));
		
	}
	
	public static boolean inBuilt(int arrayOne[],int arrayTwo[]) {
		if(!Arrays.equals(arrayOne, arrayTwo)) return false;;
		return true;
	}
	

}
