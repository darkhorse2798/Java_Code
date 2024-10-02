package com.java.coding;

import java.util.*;

class Solution {

    Solution next;
    int val;

    public Solution(int val) {
        this.val = val;
        this.next = null;
    }

    public static void main(String[] args) {
        // Test for various functions

        // 1. Reverse linked list
        Solution l1 = new Solution(1);
        Solution l2 = new Solution(2);
        Solution l3 = new Solution(3);
        Solution l4 = new Solution(4);
        Solution l5 = new Solution(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        l1 = reverse(l1);
        printList(l1);
        System.out.println();

        // 2. Move Zeros to the right
        moveZerosAtRight();

        System.out.println();

        // 3. Merge Sort
        int arr[] = {2, -2, 1, -1, 0, 2, 3, 4};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        // 4. Insertion Sort
        insertionSort();

        System.out.println();

        // 5. Bubble Sort
        bubbleSort();

        System.out.println();

        // 6. Median
        System.out.println(median());

        // 7. Longest Common Prefix
        System.out.println(longestCommonPrefix());

        // 8. Remove Duplicates from Array
        duplicateRemove();

        System.out.println();

        // 9. Intersection of Two Arrays
        interSectionOfTwoArray();

        System.out.println();

        // 10. Factorial of a Number
        System.out.println(factorialOfNumber(5));

        // 11. Fibonacci Series
        for (int i = 0; i < 5; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // 12. Check if Two Strings are Anagrams
        System.out.println(anagram("The Morse Code", "Here Come Dots"));

        // 13. Check if a Number is Prime
        System.out.println(prime(29));
    }

    // Function to print a linked list
    public static void printList(Solution head) {
        Solution ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + " --> ");
            ptr = ptr.next;
        }
        System.out.print("null");
    }

    // Reverse a linked list using Stack
    public static Solution reverse(Solution head) {
        Stack<Integer> stack = new Stack<>();
        Solution current = head;

        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        Solution reversed = new Solution(Integer.MIN_VALUE);
        Solution ptr = reversed;

        while (!stack.isEmpty()) {
            ptr.next = new Solution(stack.pop());
            ptr = ptr.next;
        }
        return reversed.next;
    }

    // Move all zeros to the right
    public static void moveZerosAtRight() {
        int arr[] = {8, 0, 1, 5, 7, 0, 9, 0};
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] res = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                res[k++] = arr[i++];
            } else {
                res[k++] = arr[j++];
            }
        }

        while (i <= mid) res[k++] = arr[i++];
        while (j <= end) res[k++] = arr[j++];

        System.arraycopy(res, 0, arr, start, res.length);
    }

    // Insertion Sort
    public static void insertionSort() {
        int arr[] = {2, -2, 1, -1, 0, 2, 3, 4};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort
    public static void bubbleSort() {
        int arr[] = {2, 3, 4, 1, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Find Median
    public static double median() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = arr.length;
        if (length % 2 == 1) {
            return arr[length / 2];
        } else {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        }
    }

    // Longest Common Prefix
    public static String longestCommonPrefix() {
        String[] input = {"flower", "flow", "flight"};
        Arrays.sort(input);
        String start = input[0];
        String end = input[input.length - 1];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == end.charAt(i)) {
                builder.append(start.charAt(i));
            } else {
                break;
            }
        }
        return builder.toString();
    }

    // Remove Duplicates from Array
    public static void duplicateRemove() {
        int arr[] = {1, 2, 1, 3, 4, 1, 2, 5, 6};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }

    // Intersection of Two Arrays
    public static void interSectionOfTwoArray() {
        int arr1[] = {5, 4, 1, 2, 3, 6};
        int arr2[] = {3, 4, 7, 8, 9};
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Factorial of a Number
    public static int factorialOfNumber(int num) {
        if (num <= 1) return 1;
        return num * factorialOfNumber(num - 1);
    }

    // Fibonacci Series
    public static int fibonacci(int term) {
        if (term <= 1) return term;
        return fibonacci(term - 1) + fibonacci(term - 2);
    }

    // Check if Two Strings are Anagrams
    public static boolean anagram(String string1, String string2) {
        char arr1[] = string1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char arr2[] = string2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // Check if a Number is Prime
    public static boolean prime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
