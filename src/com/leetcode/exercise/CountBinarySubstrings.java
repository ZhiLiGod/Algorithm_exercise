package com.leetcode.exercise;

public class CountBinarySubstrings {
	public static void main(String[] args) {
		System.out.println(countBinarySubstrings("0011"));
	}
	
	static public int countBinarySubstrings(String s) {
		int prevRunLength = 0, curRunLength = 1, res = 0;
	    for (int i=1;i<s.length();i++) {
	        if (s.charAt(i) == s.charAt(i-1)) curRunLength++;
	        else {
	            prevRunLength = curRunLength;
	            curRunLength = 1;
	        }
	        if (prevRunLength >= curRunLength) res++;
	    }
	    return res;
    }
}
