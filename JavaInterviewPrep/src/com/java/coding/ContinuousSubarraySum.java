package com.java.coding;
import java.util.ArrayList;
import java.util.List;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 15;

        List<List<Integer>> result = findContinuousSubarrays(arr, target);

        if (result.isEmpty()) {
            System.out.println("No continuous subarrays found with sum " + target);
        } else {
            System.out.println("Continuous subarrays with sum " + target + ":");
            for (List<Integer> subarray : result) {
                System.out.println(subarray);
            }
        }
    }

    public static List<List<Integer>> findContinuousSubarrays(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        int currentSum = 0;

        while (end < arr.length) {
            currentSum += arr[end];  //

            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                result.add(subarray);
            }

            end++;
        }

        return result;
    }
}