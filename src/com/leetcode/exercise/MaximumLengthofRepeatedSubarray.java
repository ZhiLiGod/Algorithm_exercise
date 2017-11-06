package com.leetcode.exercise;

public class MaximumLengthofRepeatedSubarray {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,2,1};
		int[] b = {3,2,1,4,7};
		System.out.println(findLength(a, b));
	}
	
	static public int findLength(int[] a, int[] b) {
		if(a == null || b == null) return 0;
		int max = 0;
		int[][] dp = new int[a.length+1][b.length+1];
		for(int i = 0 ; i < a.length+1 ; i++){
			for(int j = 0 ; j < b.length + 1 ; j++){
				if(i == 0 || j == 0) dp[i][j] = 0;
				else if(a[i-1] == b[j-1]) {
					dp[i][j] = 1 + dp[i-1][j-1];
					max = Math.max(max, dp[i][j]);
				}
			}
		}
		return max;
    }
}
