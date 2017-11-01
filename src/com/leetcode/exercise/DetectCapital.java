package com.leetcode.exercise;

public class DetectCapital {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("gffF"));
	}
	
	static public boolean detectCapitalUse(String word) {
        int count = 0;
        for(Character c : word.toCharArray()) if(Character.isUpperCase(c)) count++;
        return ((count == 1 && Character.isUpperCase(word.charAt(0))) || count == 0 || count == word.length()) ? true : false;
    }
}
