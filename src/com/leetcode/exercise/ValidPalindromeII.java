package com.leetcode.exercise;

public class ValidPalindromeII {
	public static void main(String[] args) {
		System.out.println(validPalindrome("gbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbg"));
	}
	
	static public boolean validPalindrome(String s) {
		if(s == null || s.length() == 0) return false;
        int i = 0, j = s.length()-1;
		while(i < j){
			if(s.charAt(i) != s.charAt(j)) return isP(i+1, j, s) || isP(i, j-1, s);
			i++;
			j--;
		}
		return true;
    }
	
	static public boolean isP(int i, int j, String s){
		while(i < j){
			if(s.charAt(i) != s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}
