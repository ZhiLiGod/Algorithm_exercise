package com.leetcode.exercise;

public class HouseRobberII {
	public static void main(String[] args) {
//		int[] a = {1,5,10};
//		int[] b = {5,10,2};
//		System.out.println(helper(a));
//		System.out.println(helper(b));
		int[] a = {1};
		System.out.println(rob(a));
	}
	
	static public int rob(int[] nums) {
		int[] b = nums.clone();
		b[0] = Integer.MIN_VALUE;
		nums[nums.length-1] = Integer.MIN_VALUE;
		return Math.max(helper(b), helper(nums));
    }
	
	static public int helper(int[] num) {
		int[][] dp = new int[num.length + 1][2];
		for(int i = 1 ; i <= num.length ; i++){
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
			dp[i][1] = dp[i-1][0] + num[i-1];
		}
		return Math.max(dp[num.length][0], dp[num.length][1]);
    }
}
