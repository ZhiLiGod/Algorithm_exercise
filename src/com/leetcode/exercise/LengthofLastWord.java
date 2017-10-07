package com.leetcode.exercise;

public class LengthofLastWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("    "));
	}
	
	static public int lengthOfLastWord(String s) {
		//if(s.) return 0;
		String[] str = s.split(" ");
		if(str.length == 0) return 0;
		return str[str.length-1].length();
    }
}
