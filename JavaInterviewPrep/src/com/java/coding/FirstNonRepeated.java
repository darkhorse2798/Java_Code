package com.java.coding;

public class FirstNonRepeated {
	public static void main(String[] args) {
		String str="Nitesh Shaw";
		
		//Nitesh Shaw 
//        l          r		
		int arr[]= new int[255];
		
		for(int i=0; i<arr.length;i++) {
			char ch =str.charAt(i);
			arr[ch]++;

		}
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]);
				break;
			}
		}
//		for(char res : ch) {
//			
//		}
//		boolean flag=false;
//		for(int i=0; i<str.length();i++) {
//			for(int j=i+1;j<str.length()-1;j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					
//					flag=true;
//				} 
//			}
//			if(!flag) {
//				System.out.println(str.charAt(i));
//				break;
//			}
//		}
	}

}
