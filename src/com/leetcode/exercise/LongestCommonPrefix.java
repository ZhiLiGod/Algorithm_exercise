package com.leetcode.exercise;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = {
				"abc", "abd", "ab", "acvb"
		};
		System.out.println(longestCommonPrefix(new String[]{"bc", "ac"}));
	}
	
	static public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String str = strs[0];
        for(int i = 1 ; i < strs.length ; i++){
        	while(strs[i].indexOf(str) != 0){
        		str = str.substring(0, str.length()-1);
        	}
        }
        return str;
    }
}
