package com.leetcode.exercise;

import java.util.Arrays;

public class ReverseVowelsofaString {
	public static void main(String[] args) {
		System.out.println(reverseVowels(".,"));
	}
	
	static public String reverseVowels(String s) {
        if(s == null || s.length() == 0) return s;
		String vowels = "aeiouAEIOU";
		int i = 0, j = s.length() - 1;
		char[] c = s.toCharArray();
		while(i < j){
			while(!vowels.contains(String.valueOf(c[i])) && i < j) i++;
			while(!vowels.contains(String.valueOf(c[j])) && i < j) j--;
			if(i < j){
				char tmp = c[i];
				c[i] = c[j];
				c[j] = tmp;
				i++;
				j--;
			}
		}
		return String.valueOf(c);
    }
}
