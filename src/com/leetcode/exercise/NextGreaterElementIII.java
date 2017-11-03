package com.leetcode.exercise;

import java.util.Arrays;

public class NextGreaterElementIII {
	public static void main(String[] args) {
		System.out.println(nextGreaterElement(12443322));
	}
	
	static public int nextGreaterElement(int n) {
        char[] s = (n + "").toCharArray();
        int i;
        for(i = s.length - 1 ; i > 0 ; i--){
        	if(s[i-1] < s[i]) break;
        }
        if(i == 0) return -1;
        System.out.println(i);
        int min = s[i-1], index = i;
        for(int j = i ; j < s.length ; j++){
        	if(s[j] > min && s[j] <= s[index]) {
        		index = j;
        	}
        }
        char tmp = s[i-1];
        s[i-1] = s[index];
        s[index] = tmp;
        Arrays.sort(s, i, s.length);
        long res = Long.parseLong(String.valueOf(s));
        return res <= Integer.MAX_VALUE ? (int)res : -1;
    }
}
