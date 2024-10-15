package com.java.coding;

import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		int len=stack.size();		
		Stack<Integer> reversedStack = new Stack<>();
		for(int i=0; i<len;i++) {
			
			reversedStack.push(stack.pop());
			
		}
		System.out.println(reversedStack);
	}

}
