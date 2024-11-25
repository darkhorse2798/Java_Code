package com.linkedlist.java.genpact;

import java.util.Arrays;

public class ShiftZerosToRight {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 0, 4, 0, 5, 6,0,7,1};
              //           l                          r     r
		  //                    m               
        int mid = 0;
        int left = 0;
        int right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] != 0) {
//            	int res = arr[mid];
//                arr[mid] = arr[left];
//                arr[left] = res;
            	arr[left]=arr[mid];
                left++; 
                mid++;  
            } else {
                
                mid++;
            }
        }
        while(left<=right) {
        	arr[left]=0;
        	left++;
        }

         System.out.println(Arrays.toString(arr));
       
    }

    
}
