package com.leetcode.exercise;

public class HouseRobber {
	
	public static void main(String[] args) {
		int[] nums = {1,5,10,2,3};
		System.out.println(rob(nums));
	}
	
	static public int rob(int[] num) {
		int[][] dp = new int[num.length + 1][2];
		for(int i = 1 ; i <= num.length ; i++){
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
			dp[i][1] = dp[i-1][0] + num[i-1];
		}
		return Math.max(dp[num.length][0], dp[num.length][1]);
    }
}
