package com.leetcode.exercise;

public class NumberofSegmentsinaString {
	public static void main(String[] args) {
		System.out.println(countSegments(", , , ,        a, eaefa"));
	}
	
	static public int countSegments(String s) {
		if(s == null || s.length() == 0) return 0;
        String[] ss = s.split(" ");
        int count = 0;
        for(int i = 0 ; i < ss.length ; i++){
        	if(!ss[i].equals("")) count++;
        }
        return count;
    }
}	
