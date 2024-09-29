package com.leetcode.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
    public static void main(String[] args) {
     int arr[]={-1,0,1,2,-1,-4};
     Arrays.sort(arr);
     //-4 ,-1,-1,0,1,2;
    int  target=0;
    List<List<Integer>> result = new ArrayList<>();
     for(int i=0; i<arr.length-2;i++){
      if(i>0 && arr[i]==arr[i-1]) continue;
       int left=i+1;
       int right=arr.length-1;
       while(left<right){
         int sum=arr[i]+arr[left]+arr[right];
         
        
         if(sum==target){
           result.add(Arrays.asList(arr[i],arr[left],arr[right]));
          // result.add(Arrays.asList(nums[i], nums[left], nums[right]));

         while(left<right && arr[left]==arr[left+1]) left++;
         while(left<right && arr[right]==arr[right-1]) right--;
         left++;
         right--;
           
         }else if(sum<target) left++;
         else right--;
       
       }
       
     }
     System.out.println(result);
  }
}
