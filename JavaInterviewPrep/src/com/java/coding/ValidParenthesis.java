package com.java.coding;

import java.util.Stack;

public class ValidParenthesis {
	    public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        for(Character ch : s.toCharArray()){
	            if(ch=='(') stack.push(')');
	            else if(ch=='{') stack.push('}');
	            else if(ch=='[') stack.push(']');
	            else if(stack.isEmpty() || stack.pop()!=ch) return false;
	        }
	        
	        return stack.isEmpty();
	    }
	}
