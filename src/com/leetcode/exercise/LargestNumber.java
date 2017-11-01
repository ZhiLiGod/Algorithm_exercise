package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	public static void main(String[] args) {
		int[] a = {0,0};
		System.out.println(largestNumber(a));
	}
	
	static public String largestNumber(int[] nums) {
		if(nums == null || nums.length == 0) return null;
		String[] str = new String[nums.length];
		for(int i = 0 ; i < nums.length ; i++){
			str[i] = String.valueOf(nums[i]);
		}
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String s1 = o1 + o2;
				String s2 = o2 + o1;
				return s2.compareTo(s1);
			}
			
		};
		Arrays.sort(str, comp);
		if(str[0].equals("0")) return "0";
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < str.length ; i++){
			sb.append(str[i]);
		}
		return sb.toString();
    }
	
	
}
