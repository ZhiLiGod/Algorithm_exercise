package com.leetcode.exercise;

import java.util.Stack;

public class ValidParenthesisString {
	public static void main(String[] args) {
		System.out.println(checkValidString("((*******()))"));
	}
	
	static public boolean checkValidString(String s) {
		return check(s, 0, 0);
    }
	
	static public boolean check(String s, int start, int count){
		if(count < 0) return false;
		for(int i = start; i< s.length() ; i++){
			char c = s.charAt(i);
			if(c == '(') count++;
			else if(c == ')') {
				if(count ==0) return false;
				count--;
			}
			else if(c == '*') return check(s, i + 1, count + 1) || check(s, i + 1, count - 1) || check(s, i + 1, count);
		}
		return count == 0;
	}
}
