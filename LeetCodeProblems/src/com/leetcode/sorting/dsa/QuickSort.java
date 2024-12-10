package com.leetcode.sorting.dsa;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        
        // Print sorted array
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int arr[], int begin, int end) {
        if(begin < end) {
            int partition = findPartition(arr, begin, end);  //
            quickSort(arr, begin, partition-1);
            quickSort(arr, partition+1, end);
        }
    }

    private static int findPartition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin-1;  //i=-1

        for(int j = begin; j < end; j++) {   //j=0;j<
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);  //1 4 3 2 5
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
	


