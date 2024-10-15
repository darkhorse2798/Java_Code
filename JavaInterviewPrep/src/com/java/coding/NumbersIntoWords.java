package com.java.coding;

public class NumbersIntoWords {
	public static void main(String[] args) {
		  int number=6571; //onetwothreefour;
		    String digitsInWords[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
		    StringBuilder builder = new StringBuilder();
		    String str =String.valueOf(number);
		    // System.out.println(str instanceof String);
		    for(char ch : str.toCharArray()){
		      int digit=ch-'0';
		      builder.append(digitsInWords[digit]);
		      
		    }
		    System.out.println(builder.toString());
	}

}
