package com.java.coding;

public class OccurrenceOfEachCharacter{
    public static void main(String[] args) {
        String str = "ABCF";

        char arr[] = str.toCharArray();
        int count[] = new int[255]; 

        for (char ch : arr) {
        	if(ch==' ') continue;
            count[ch]++;
        }

        System.out.println("Character occurrences:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) { 
                System.out.println((char) i + " : " + count[i]);
            }
        }
    }
}
