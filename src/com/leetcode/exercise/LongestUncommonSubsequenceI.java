package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class LongestUncommonSubsequenceI {
	public static void main(String[] args) {
		System.out.println(findLUSlength("aba", "cdc"));
	}
	
	static public int findLUSlength(String a, String b) {
		return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
