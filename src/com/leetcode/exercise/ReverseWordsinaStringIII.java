package com.leetcode.exercise;

public class ReverseWordsinaStringIII {
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	static public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = null;
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < str.length ; i++){
        	sb = new StringBuilder(str[i]);
        	sb.reverse();
        	res.append(sb).append(" ");
        }
        res.delete(res.length()-1, res.length());
        return res.toString();
    }
}
