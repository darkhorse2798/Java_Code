package com.java.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramProgram {
	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");
		System.out.println(".......................");

		isAnagram("keEp", "peeK");
		System.out.println(".......................");
		isAnagram("SiLeNt CAT", "LisTen AcT");
		System.out.println(".......................");

		isAnagram("Debit Card", "Bad Credit");
		System.out.println(".......................");

		isAnagram("School MASTER", "The ClassROOM");
		System.out.println(".......................");

		isAnagram("DORMITORY", "Dirty Room");
		System.out.println(".......................");

		isAnagram("ASTRONOMERS", "NO MORE STARS");
		System.out.println(".......................");

		isAnagram("Toss", "Shot");
		System.out.println(".......................");

		isAnagram("joy", "enjoy");
		System.out.println(".......................");

	}

	private static void isAnagram(String string1, String string2) {
		if (string1 == null || string2 == null) {
			System.out.println("Not an Anagram String");
			return;
		}

		if (string1.length() != string2.length()) {
			System.out.println("Not an Anagram String");
			return;
		}
		int countOne[] = new int[255];
		int countTwo[] = new int[255];
		char arr[] = string1.toLowerCase().toCharArray();
		char array[] = string2.toLowerCase().toCharArray();

		Arrays.sort(arr);
		Arrays.sort(array);
		for (char res : arr) {
			countOne[res]++;
		}
		for (char res1 : array) {
			countTwo[res1]++;
		}
		if (Arrays.equals(countOne, countTwo)) {
			System.out.println("Anagram String it is ");
			return;
		}
		System.out.println("Not a Anagram String");

	}

}
