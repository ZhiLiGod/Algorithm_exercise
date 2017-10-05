package com.leetcode.exercise;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("(()){}[]"));
	}
	
	static public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
        	if(c == '(')st.push(')');
        	else if(c == '{') st.push('}');
        	else if(c == '[') st.push(']');
        	else if(st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
}
