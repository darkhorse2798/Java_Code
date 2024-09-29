package com.java.coding;

public class ReverseString {
	public static void main(String[] args) {
//		String word="  Name   my is  Nitesh";
//		String str="Hello_World";
		String word=" Hello Interviewer";
//		String str=" Hh";
//		String str="k";
//		System.out.println(reverse(str));
		System.out.println(reverseOrderOfWord(word));
		
		
	}
 public static String reverse(String str){
	 
	 if(str==null) return null;
	 if(str.length()==1) return str;
	 str=str.trim();
	 int start=0;
	 int end=str.length()-1;
	 char[] arr=str.toCharArray();
	 while(start<=end) {
		char temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	 }
	 return new String(arr);
	 
 }
 public static String reverseOrderOfWord(String word){
	 StringBuilder builder = new StringBuilder();
	 int end=word.length();
	 for(int i=word.length()-1;i>=0;i--) {
		 if(word.charAt(i)== ' ') {
			 builder.append(word.substring(i+1,end)).append(' ');
			 end=i;
		 }
	 }
//My Name is Nitesh; Nitesh is Name 
//"  Name   my is___Nitesh";Nitesh

	 builder.append(word.substring(0,end));
	 return builder.toString().trim();
	
	 
 }
}
